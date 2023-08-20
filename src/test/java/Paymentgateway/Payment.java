package Paymentgateway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Payment {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome,driver", System.getProperty("user.dir")+"//driver//chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			 options.addArguments("--remote-allow-origins=*");
			  WebDriver driver = new ChromeDriver(options);

			   driver.manage().window().maximize();
			//driver= new ChromeDriver();
			driver.get("https://demo.guru99.com/v4/");
			driver.findElement(By.xpath("//*[contains(text(),\"Payment Gateway Project\")]")).click();
			Thread.sleep(5000);
//			driver.switchTo().frame("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0");
			int add=driver.findElements(By.xpath("//*[@id=\"dismiss-button\"]")).size(); //count of elements identified
			//String can be used as both class and data type, hence starts with capital
			System.out.println("displayed is "+add);
			if (add==1) 
			{ 
				// code for handling alert
			driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]")).click();
			}
			else {
				// code for handling nrml seq 
			}
		    Thread.sleep(5000);
		    
		    
			String productname=driver.findElement(By.xpath("//h2[contains(text(),\"Mother Elephant With Babies Soft Toy\")]")).getText();
			System.out.println("Product name is "+productname);
			String price=driver.findElement(By.xpath("//*[contains(text(),\"Price: $20\")]")).getText();
			System.out.println(""+price);
			Select quantity= new Select (driver.findElement(By.xpath("//*[@name=\"quantity\"]")));
			quantity.selectByValue("3");
//			System.out.println(""+quantity); 
			driver.findElement(By.xpath("//*[@value=\"Buy Now\"]")).click();
			
			
			String paymentprocess=driver.findElement(By.xpath("//*[contains(text(),\"Payment Process\")]")).getText();
			System.out.println(""+paymentprocess);
			String amount=driver.findElement(By.xpath("//*[@class=\"6u 12u$(xsmall)\"]")).getText();
			System.out.println(""+amount);
//			String weaccept=driver.findElement(By.xpath("[@class=\"6u$ 12u$(xsmall)]\"")).getText();
//			System.out.println(""+weaccept);
			driver.findElement(By.xpath("//*[@id=\"card_nmuber\"]")).sendKeys("1234567890123456");
			//System.out.println("entered card number is "+1234567890123456);
			driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("05");
			driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("2028");
			driver.findElement(By.xpath("//*[@id=\"cvv_code\"]")).sendKeys("123");
			driver.findElement(By.xpath("//*[@name=\"submit\"]")).click();
			String message=driver.findElement(By.xpath("//*[contains(text(),\"Payment successfull!\")]")).getText();
			System.out.println("Status is "+message);
			String message1=driver.findElement(By.xpath("//*[@class=\"alt access\"]//tr[1]")).getText();
			System.out.println(""+message1);
			driver.findElement(By.xpath("//*[contains(text(),\"Home\")]")).click();
			
			
			driver.quit();
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}


	}

}


