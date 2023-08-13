package Apple.Ball;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Productremoving {

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
       driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();  
       driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click(); 
       driver.findElement(By.xpath("//*[@class=\"shopping_cart_link\"]")).click();
       String cartstatus=driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]")).getText();
       System.out.println("cart status " + cartstatus);
       driver.quit();
	}
}
