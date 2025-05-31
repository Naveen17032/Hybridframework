package testCases;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	 public WebDriver driver;
	 public Properties p;
	
	@BeforeClass
    @Parameters({"os","browser"})
	public void setup(String os,String br) throws IOException 
	{
		//To read the files from config
		FileReader file=new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		 switch(br.toLowerCase())
		 {
		 case "chrome" : driver=new ChromeDriver();break;
		 case "edge" : driver=new EdgeDriver();break;
		 case "firefox" : driver=new FirefoxDriver();break;
		 default : System.out.println("no browser found");return;
		 }
		
		// driver=(WebDriver) new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get(p.getProperty("appurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	 public String randomeString() {
	        return RandomStringUtils.randomAlphabetic(5);
	    }

	    public String randomeNumber() {
	        return RandomStringUtils.randomNumeric(10);
	    }

	    public String randomAlphaNumeric() {
	        String str = RandomStringUtils.randomAlphabetic(3);
	        String num = RandomStringUtils.randomNumeric(3);
	        return str + "@" + num;
	    }
	    
	    public String captureScreenshot(String tname) {
			String timestamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			TakesScreenshot takescreenshot=(TakesScreenshot) driver;
			File source=takescreenshot.getScreenshotAs(OutputType.FILE);
			String destination =System.getProperty("user.dir")+"\\Screenshot\\"+tname+"_"+timestamp+".png";
			
			try {
				FileUtils.copyFile(source, new File(destination));
			}
			catch (Exception e){
				e.getMessage();
			}
			return destination;
			
		}
	    
	   @AfterClass
	    public void teardown() {
	        driver.quit();
	    }

}

