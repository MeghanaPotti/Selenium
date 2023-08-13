package Apple.Ball;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Productdetails {

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
       
       
       
       
       for(int i=1; i<=6; i++) {
    	   String productDetails=driver.findElement(By.xpath("(//*[@class=\"inventory_item_description\"])["+i+"]//*[@class=\"inventory_item_name\"]")).getText();
           System.out.println( i+ " productname is " + productDetails);
           String pricevalue = driver.findElement(By.xpath("(//*[@class=\"inventory_item_description\"])["+i+"]//*[@class=\"inventory_item_price\"]")).getText();
           System.out.println(i+ " pricevalue is "+pricevalue);
       }
       driver.quit();
	}
}