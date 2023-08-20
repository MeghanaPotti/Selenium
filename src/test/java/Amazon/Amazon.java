package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {
	
	public static void main(String[] args) {
		try {

			System.setProperty("webdriver.chrome,driver", System.getProperty("user.dir")+"//driver//chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			 options.addArguments("--remote-allow-origins=*");
			  WebDriver driver = new ChromeDriver(options);

			   driver.manage().window().maximize();
			//driver= new ChromeDriver();
			driver.get("https://www.amazon.in/");
			System.out.println(driver.getTitle());
			String window1=driver.getWindowHandle();
			driver.findElement(By.xpath("//*[@class=\"nav-line-1-container\"]//*[contains(text(),\"Hello, sign in\")]")).click();
			driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("9985161044");
			driver.findElement(By.xpath("//span[@id=\"continue\"]")).click();
			
			driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("@Pmsmhs3");
			driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
			Thread.sleep(15000);
			
			driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("go pro 11");
			driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
			
            driver.findElement(By.xpath("//*[@data-component-id=\"12\"]//div[@class=\"a-section aok-relative s-image-fixed-height\"]")).click();
           // driver.switchTo().newWindow(WindowType.TAB);   
            driver.switchTo().window(null);
            driver.navigate().to("https://www.amazon.in/GoPro-Waterproof-HyperSmooth-Resolution-Streaming/dp/B0BVFKWNRK/ref=sr_1_1_sspa?crid=1T811P04B3QDB&keywords=go%2Bpro%2B11&qid=1692022515&sprefix=go%2Bpro%2B11%2Caps%2C292&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1");
            Thread.sleep(2000);
    		System.out.println(driver.getTitle());
    		String window2=driver.getWindowHandle();
            
    		String productname=driver.findElement(By.xpath("//*[@id=\"productTitle\"]")).getText();
			System.out.println(""+productname);
			String suggestion=driver.findElement(By.xpath("//*[@class=\"a-size-small aok-float-left ac-badge-rectangle\"]")).getText();
			System.out.println("Suggestion is "+suggestion);
			
//			driver.findElement(By.xpath("//*[@id=\"magnifierLens\"]")).click();  //mouse actions
			
//			WebElement ele = driver.findElement(By.xpath("<xpath>"));
//
//			//Creating object of an Actions class
//			Actions action = new Actions(driver);
//
//			//Performing the mouse hover action on the target element.
//			action.moveToElement(ele).perform();
			
			
//			driver.findElement(By.xpath("//*[@data-action=\"a-popover-close\"]")).click();
//			
//			String offerprice=driver.findElement(By.xpath("//*[@class=\"a-section a-spacing-none aok-align-center aok-relative\"]")).getText();
//			System.out.println(""+offerprice);
			String productdetails=driver.findElement(By.xpath("//*[@id=\"feature-bullets\"]")).getText();
			System.out.println(""+productdetails);
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
			Thread.sleep(15000);
			String status=driver.findElement(By.xpath("//div[contains(text(),\"Added to Cart\")]")).getText();
			System.out.println(""+status);
			String cartvalue=driver.findElement(By.xpath("//*[@id=\"attach-accessory-cart-total-string\"]")).getText();
			System.out.println(""+cartvalue);
			driver.findElement(By.xpath("//*[@aria-labelledby=\"attach-sidesheet-checkout-button-announce\"]")).click();
			Thread.sleep(15000);
			
			driver.findElement(By.xpath("//*[@id=\"subtotalsSection\"]//input[@type=\"submit\"]")).click();
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("//*[contains(text(),\"RuPay ending in 8084\")]")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id=\"pp-WDpq79-137\"]")).sendKeys("180");
			driver.findElement(By.xpath("//*[@aria-labelledby=\"orderSummaryPrimaryActionBtn-announce\"]")).click();
			driver.findElement(By.xpath("//*[@aria-labelledby=\"submitOrderButtonId-announce\"]")).click();
		
			driver.findElement(By.xpath("//a[contains(text(),\"Cancel\")]")).click();
			
			String orderstatus=driver.findElement(By.xpath("//*[contains(text(),\"Order is on hold\")]")).getText();
			System.out.println(""+orderstatus);
			Thread.sleep(3000);
			driver.quit();	
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
