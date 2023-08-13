package Apple.Ball;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Instagram {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome,driver", System.getProperty("user.dir")+"//driver//chromedriver.exe");
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
WebDriver driver = new ChromeDriver(options);
driver.manage().window().maximize();
driver.get("https://www.google.com/search?q=instagram&rlz=1C1GCEB_enIN1003IN1003&oq=ins&aqs=chrome.0.69i59j69i64j69i57j0i131i433i512j0i512j69i60l3.1145j0j7&sourceid=chrome&ie=UTF-8");
driver.findElement(By.xpath("//*[contains(text(),\"https://www.instagram.com\")]/ancestor::div[@class=\"TbwUpd NJjxre iUh30 ojE3Fb\"]")).click();
driver.findElement(By.xpath("//*[@aria-label=\"Phone number, username, or email\"]")).sendKeys("pottimeghana123@gmail.com");
driver.findElement(By.xpath("//*[@aria-label=\"Password\"]")).sendKeys("@Pmsmhs3");
driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
driver.findElement(By.xpath("//*[contains(text(),\"Log out\")]")).click();
driver.quit();		
	}
}
