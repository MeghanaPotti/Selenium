package Apple.Ball;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Productcheckouttc {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome,driver", System.getProperty("user.dir")+"//driver//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		  WebDriver driver = new ChromeDriver(options);

		   driver.manage().window().maximize();
		//driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/inventory.html"); //10-18 lines common unless for diff url
		
		driver.findElement(By.xpath("//*[@name=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@name=\"login-button\"]")).click();	
		
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]")).click(); 
		driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click(); 
		driver.findElement(By.xpath("//*[@name=\"checkout\"]")).click();
		
		driver.findElement(By.xpath("//*[@name=\"firstName\"]")).sendKeys("Meghana");
		driver.findElement(By.xpath("//*[@name=\"lastName\"]")).sendKeys("Potti");
		driver.findElement(By.xpath("//*[@name=\"postalCode\"]")).sendKeys("500018");
		driver.findElement(By.xpath("//*[@name=\"continue\"]")).click();  
		 
		String cardtext=driver.findElement(By.xpath("//div[contains(text(),\"SauceCard\")]")).getText();
		System.out.println("cardtext is "+cardtext);
		
		driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
		
		driver.quit();//to close the entire window
		}

}