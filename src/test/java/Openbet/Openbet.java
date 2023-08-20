package Openbet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Openbet {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome,driver", System.getProperty("user.dir")+"//driver//chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			 options.addArguments("--remote-allow-origins=*");
			  WebDriver driver = new ChromeDriver(options);

			   driver.manage().window().maximize();
			//driver= new ChromeDriver();
			driver.get("https://backoffice-obr2-stg.internal.coral.co.uk/admin");
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Administrator");
			driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("1ncharge");
			driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
			
			driver.findElement(By.xpath("//*[contains(text(),\"Betting Setup\")]")).click();   ////*[@id=\"vclickMenu\"]/child::li[2]
			driver.findElement(By.xpath("//a[contains(text(),\"Events\")]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"CategoryId\"]//*[@value=\"21\"]")).click();
//			driver.findElement(By.xpath());
//			driver.findElement(By.xpath());
//			driver.findElement(By.xpath());
//			driver.findElement(By.xpath());
//			driver.findElement(By.xpath());
//			driver.findElement(By.xpath());
//			driver.findElement(By.xpath());
//			driver.findElement(By.xpath());
//			driver.findElement(By.xpath());
//			driver.findElement(By.xpath());
//			driver.findElement(By.xpath());
//			driver.findElement(By.xpath());
//			driver.findElement(By.xpath());
			driver.quit();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
