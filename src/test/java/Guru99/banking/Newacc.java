package Guru99.banking;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Newacc extends Basetest {

	public static void main(String[] args) {
		try {
			Newacc na = new Newacc();
			na.login();
			driver.findElement(By.xpath("//*[contains(text(),\"New Account\")]")).click();
			// new account
			driver.findElement(By.xpath("//*[@name=\"cusid\"]")).sendKeys(na.customerid);
			// drop down
			Select s= new Select (driver.findElement(By.xpath("//*[@name=\"selaccount\"]")));
			// s.selectByIndex(1); 
			s.selectByValue("Current");
			driver.findElement(By.xpath("//*[@name=\"inideposit\"]")).sendKeys("1000");
			driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
			String status = driver.findElement(By.xpath("//*[@id=\"account\"]//tr[1]")).getText();
			System.out.println("Status is "+status);
			String text = driver.findElement(By.xpath("//*[@id=\"account\"]//tr[2]")).getText();
			System.out.println("Contains "+text);
			String acid = driver.findElement(By.xpath("//*[@id=\"account\"]//tr[4]")).getText();
			System.out.println("Contains "+acid);
			String cusid = driver.findElement(By.xpath("//*[@id=\"account\"]//tr[5]")).getText();
			System.out.println("Contains "+cusid);
			String cusname = driver.findElement(By.xpath("//*[@id=\"account\"]//tr[6]")).getText();
			System.out.println("Contains "+cusname);
			String email = driver.findElement(By.xpath("//*[@id=\"account\"]//tr[7]")).getText();
			System.out.println("Contains "+email);
			String actype = driver.findElement(By.xpath("//*[@id=\"account\"]//tr[8]")).getText();
			System.out.println("Contains "+actype);
			String openingdate = driver.findElement(By.xpath("//*[@id=\"account\"]//tr[9]")).getText();
			System.out.println("Contains "+openingdate);
			String amount = driver.findElement(By.xpath("//*[@id=\"account\"]//tr[10]")).getText();
			System.out.println("Contains "+amount);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[contains(text(),\"Home\")]")).click();
			driver.switchTo().frame("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0");
			int add=driver.findElements(By.xpath("//*[@id=\"dismiss-button\"]")).size(); //count of elements identified
			//String can be used as both class and data type, hence starts with capital
			System.out.println("displayed is "+add);
		//	driver.switchTo().alert().
			if (add==1) 
				{ 
					// code for handling alert
				driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]")).click();
				}
				else {
					// code for handling nrml seq 
				}
			Thread.sleep(5000);
			driver.switchTo().defaultContent(); 
			driver.findElement(By.xpath("//*[contains(text(),\"Log out\")]")).click();
			String message1 =driver.switchTo().alert().getText();
			System.out.println(" alert text is " +message1);
			driver.switchTo().alert().accept();
			
			// driver.switchTo().alert().dismiss();
			driver.quit();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}

// new account, new account

// deposit