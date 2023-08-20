package NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Newtours {

	public static void main(String[] args) {
		try {
			
			System.setProperty("webdriver.chrome,driver", System.getProperty("user.dir")+"//driver//chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			 options.addArguments("--remote-allow-origins=*");
			  WebDriver driver = new ChromeDriver(options);

			   driver.manage().window().maximize();
			//driver= new ChromeDriver();
			driver.get("https://demo.guru99.com/v4/");
			driver.findElement(By.xpath("//*[contains(text(),\"New Tours\")]")).click();
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
			
			driver.findElement(By.xpath("//*[contains(text(),\"Flights\")]")).click();
			WebElement oneway=driver.findElement(By.xpath("//*[@value=\"oneway\"]"));
			oneway.click();
			Select passengers=new Select(driver.findElement(By.xpath("//*[@name=\"passCount\"]")));
			passengers.selectByValue("4");
			Select boarding=new Select (driver.findElement(By.xpath("//*[@name=\"fromPort\"]")));
			boarding.selectByValue("New York");
			Select month=new Select(driver.findElement(By.xpath("//*[@name=\"fromMonth\"]"))); 
			month.selectByValue("8");
			// driver.findElement(By.xpath("//*[@name=\"fromMonth\"]//option[9]")).click();
			Select fromday=new Select(driver.findElement(By.xpath("//*[@name=\"fromDay\"]")));
			fromday.selectByValue("29");
			Select destination=new Select(driver.findElement(By.xpath("//*[@name=\"toPort\"]")));
			destination.selectByValue("Sydney");
//			Select tomonth=new Select(driver.findElement(By.xpath("//*[@name=\"toMonth\"]")));  //return
//		    tomonth.selectByValue("December");
			driver.findElement(By.xpath("//*[@name=\"toMonth\"]//option[12]")).click();
			Select today=new Select(driver.findElement(By.xpath("//*[@name=\"toDay\"]")));
			today.selectByValue("5");
//			WebElement type=driver.findElement(By.xpath("//*[@value=\"Business\"]"));
//			type.click();
//			Select airline=new Select(driver.findElement(By.xpath("//*[@name=\"airline\"]")));
//			airline.selectByValue("Blue Skies Airlines");
//			driver.findElement(By.xpath("//*[@name=\"airline\"]//*[contains(text(),\"Blue Skies Airlines\")]"));
//			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@name=\"findFlights\"]")).click();
			
			driver.findElement(By.xpath("//*[@src=\"images/home.gif\"]")).click();
			
			driver.quit();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
