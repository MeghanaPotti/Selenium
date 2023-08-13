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
//		if (alertpresent) 
//		{ 
//			// code for handling alert
//		}
//		else {
//			// code for handling nrml seq 
//		}
		String popup= driver.switchTo().alert().getText();
		System.out.println(" alert text is " +popup);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("")).click();
		driver.quit();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
