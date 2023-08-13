package Apple.Ball;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Googlemailing {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome,driver", System.getProperty("user.dir")+"//driver//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		  WebDriver driver = new ChromeDriver(options);

		   driver.manage().window().maximize();
		//driver= new ChromeDriver();
		driver.get("https://www.google.com/search?q=google&rlz=1C1GCEB_enIN1003IN1003&oq=&aqs=chrome.0.35i39i362l3j46i39i199i362i465j35i39i362l4.25925j0j7&sourceid=chrome&ie=UTF-8");
		driver.findElement(By.xpath("//*[contains(text(),\"https://www.google.com\")]/ancestor::div[@class=\"TbwUpd NJjxre iUh30 ojE3Fb\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"gb_ta gb_qd gb_Sd gb_qe\"]")).click();
		driver.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys("pottimeghana123@gmail.com");
		driver.findElement(By.xpath("//*[contains(text(),\"Next\")]")).click();
		driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("@Pottimsmhs3");
		driver.findElement(By.xpath("//span[contains(text(),\"Next\")]")).click();
		driver.findElement(By.xpath("//*[@aria-label=\"Gmail (opens a new tab)\"]")).click();
		driver.findElement(By.xpath("//*[contains(text(),\"Compose\")]")).click();
		driver.findElement(By.xpath("//*[@class=\"agP aFw\"]")).sendKeys("pottimeghana123@gmail.com");
		driver.findElement(By.xpath("//*[@name=\"subjectbox\"]")).sendKeys("practise");
		driver.findElement(By.xpath("//*[@id=\":r7\"]")).sendKeys("Hello");
		driver.findElement(By.xpath("//*[@id=\":po\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"TN bzz aHS-bnt\"]//div[@class=\"aio UKr6le\"]")).click();
		driver.quit();
	}
}




  
