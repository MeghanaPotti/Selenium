package Guru99.banking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Switchingwindows {

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
//		String window2=driver.getWindowHandle();
		
		driver.switchTo().window(window1); //switching btwn tabs
//		driver.switchTo().window(window2);
		driver.quit();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
