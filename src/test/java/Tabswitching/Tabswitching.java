package Tabswitching;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tabswitching {
public static void main(String[] args)
{
	try {
		
		System.setProperty("webdriver.chrome,driver", System.getProperty("user.dir")+"//driver//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		   driver.manage().window().maximize();
		   
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		System.out.println(driver.getTitle());
		String window1=driver.getWindowHandle(); //used to get window id
			
		driver.switchTo().newWindow(WindowType.TAB); //?
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		String window2=driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		String window3=driver.getWindowHandle();
		
		driver.switchTo().window(window3);
		Thread.sleep(3000);
		driver.switchTo().window(window2);
		Thread.sleep(3000);
		driver.switchTo().window(window1);
		Thread.sleep(3000);
		driver.quit();
	}
	catch (Exception e) {
		System.out.println(e);
	}
}
}
