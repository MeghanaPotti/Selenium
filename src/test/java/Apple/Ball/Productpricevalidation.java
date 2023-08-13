package Apple.Ball;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Productpricevalidation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome,driver", System.getProperty("user.dir")+"//driver//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		  WebDriver driver = new ChromeDriver(options);

		   driver.manage().window().maximize();
		//driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/inventory.html");
        driver.findElement(By.xpath("//*[@name=\"user-name\"]\r\n"+ "")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@name=\"password\"]\r\n"+ "")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@name=\"login-button\"]")).click();
       String pricevalue = driver.findElement(By.xpath("//*[contains(text(),\"Sauce Labs Backpack\")]/ancestor::div[@class=\"inventory_item_description\"]//div[@class=\"pricebar\"]//div")).getText();
       System.out.println("pricevalue is "+pricevalue);
       driver.quit();
	}
}


