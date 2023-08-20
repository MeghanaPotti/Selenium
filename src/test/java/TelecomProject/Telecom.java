package TelecomProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Telecom {
	public static void main(String[] args) {
		try {
			
			System.setProperty("webdriver.chrome,driver", System.getProperty("user.dir")+"//driver//chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			 options.addArguments("--remote-allow-origins=*");
			  WebDriver driver = new ChromeDriver(options);

			   driver.manage().window().maximize();
			//driver= new ChromeDriver();
			driver.get("https://demo.guru99.com/v4/");
			driver.findElement(By.xpath("//*[contains(text(),\"Telecom Project\")]")).click();
			
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
			driver.findElement(By.xpath("//*[@class=\"flex-item left\"]//*[contains(text(),\"Add Customer\")]")).click();
			WebElement done= driver.findElement(By.xpath("//*[@id=\"done\"]"));
			done.click();
			
			driver.findElement(By.xpath("//*[@id=\"fname\"]")).sendKeys("Meghana");
			System.out.println("First name is "+ "Meghana");
			driver.findElement(By.xpath("//*[@id=\"lname\"]")).sendKeys("Potti");
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("pottimeghana123@gmail.com");
			driver.findElement(By.xpath("//*[@name=\"addr\"]")).sendKeys("BV Street Sattenapalli");
			driver.findElement(By.xpath("//*[@name=\"telephoneno\"]")).sendKeys("9985161044");
			driver.findElement(By.xpath("//*[@name=\"submit\"]")).click();
			
			String message=driver.findElement(By.xpath("//*[contains(text(),\"Access Details to Guru99 Telecom\")]")).getText();
			System.out.println(""+message);
			String customerid=driver.findElement(By.xpath("//*[@class=\"alt access\"]//tr[1]")).getText();
			System.out.println(""+customerid);
			driver.findElement(By.xpath("//*[@class=\"actions\"]//*[contains(text(),\"Home\")]")).click();
			driver.quit();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}

			