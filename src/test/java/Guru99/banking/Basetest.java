package Guru99.banking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class Basetest {
	public static WebDriver driver;
//	public Basetest(WebDriver remoteDriver){
//
//		driver =remoteDriver;
//
//		PageFactory.initElements(remoteDriver, this);
//
//		}
	 String customerid="78732";
	 String accid="125649";
	public void login() {
		 String userid="mngr521239";
		 String password="qEsarud";
		
		 String baseurl="https://demo.guru99.com/v4/";
		 System.setProperty("webdriver.chrome,driver", System.getProperty("user.dir")+"//driver//chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			 options.addArguments("--remote-allow-origins=*");
			   driver = new ChromeDriver(options);

			   driver.manage().window().maximize();
			//driver= new ChromeDriver();
			driver.get(baseurl);
	        driver.findElement(By.xpath("//*[@onblur=\"validateuserid();\"]")).sendKeys(userid);
	        driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys(password);
	        driver.findElement(By.xpath("//*[@value=\"LOGIN\"]")).click();
	       
	}

}
