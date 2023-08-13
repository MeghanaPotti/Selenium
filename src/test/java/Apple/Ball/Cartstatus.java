package Apple.Ball;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Cartstatus {

	public static void main(String[] args) {
		try {

		System.setProperty("webdriver.chrome,driver", System.getProperty("user.dir")+"//driver//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		  WebDriver driver = new ChromeDriver(options);

		   driver.manage().window().maximize();
		//driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/inventory.html");
		System.out.println(driver.getTitle());
		String window1=driver.getWindowHandle(); //used to get window id
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://demo.guru99.com/v4/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		String window2=driver.getWindowHandle();
		
		driver.switchTo().window(window1); //switching btwn tabs
//		driver.switchTo().window(window2);
		
//		@SuppressWarnings("unchecked")
//		List<String> allWindows = (List<String>) driver.getWindowHandles();
//		System.out.println(allWindows);
//		driver.switchTo().window(allWindows.get(0));
//		driver.switchTo().defaultContent(); 
//		driver.switchTo().window("Swag Labs");
//        driver.findElement(By.xpath("//*[@name=\"user-name\"]\r\n"+ "")).sendKeys("standard_user");
//        driver.findElement(By.xpath("//*[@name=\"password\"]\r\n"+ "")).sendKeys("secret_sauce");
//        driver.findElement(By.xpath("//*[@name=\"login-button\"]")).click();
//       driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();  
//       driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click(); 
//       driver.findElement(By.xpath("//*[@class=\"shopping_cart_link\"]")).click();
//       String cartstatus=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]")).getText();
//       System.out.println("cartstatus " + cartstatus);
     //  driver.quit();
	}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
}