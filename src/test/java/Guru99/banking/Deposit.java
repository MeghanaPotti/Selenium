package Guru99.banking;

import org.openqa.selenium.By;

public class Deposit extends Basetest {

	public static void main(String[] args) {
		try {
			Deposit deposit=new Deposit();
			deposit.login();
			driver.findElement(By.xpath("//a[contains(text(),\"Deposit\")]")).click();
			driver.findElement(By.xpath("//*[@name=\"accountno\"]")).sendKeys(deposit.accid);
			System.out.println("entered account number = "+deposit.accid);
			driver.findElement(By.xpath("//*[@name=\"ammount\"]")).sendKeys("1500");
			driver.findElement(By.xpath("//*[@name=\"desc\"]")).sendKeys("self");
			driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
//			driver.findElement(By.xpath("//*[contains(text(),\"Home\")]")).click();
//			driver.findElement(By.xpath("//*[contains(text(),\"Log out\")]")).click();
//			String message1 =driver.switchTo().alert().getText();
//			System.out.println(" alert text is " +message1);
//			driver.switchTo().alert().accept();	
			driver.quit();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}