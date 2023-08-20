package Guru99.banking;

import org.openqa.selenium.By;

public class Editcustomer extends Basetest{

	public static void main(String[] args) {
		try {
		Editcustomer edit= new Editcustomer();
		edit.login();
		driver.findElement(By.xpath("//*[@href=\"EditCustomer.php\"]")).click();
		driver.findElement(By.xpath("//*[@name=\"cusid\"]")).sendKeys(edit.customerid);
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//*[@onblur=\"validateAddress();\"]")).sendKeys("501,Sanjeevani Towers");
		driver.findElement(By.xpath("//*[@name=\"city\"]")).sendKeys("Sattenapalli");
		driver.findElement(By.xpath("//*[@name=\"state\"]")).sendKeys("Andhra Pradesh");
		driver.findElement(By.xpath("//*[@name=\"sub\"]")).click();
		driver.findElement(By.xpath("//*[@value=\"Submit\"]")).click();
		String text= driver.switchTo().alert().getText();
		System.out.println(" alert text is " +text);
		driver.switchTo().alert().accept();
//		if (alertpresent) 
//		{ 
//			// code for handling alert
//		}
//		else {
//			// code for handling nrml seq 
//		}
//		String popup= driver.switchTo().alert().getText();
//		System.out.println(" alert text is " +popup);
//		driver.switchTo().alert().accept();
//		driver.findElement(By.xpath("//*[contains(text(),\"Log out\")]")).click();
		driver.quit();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}

//Existing details are not overriding for address, city, state
