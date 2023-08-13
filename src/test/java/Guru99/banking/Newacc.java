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
//			String status=driver.findElement(By.xpath("//*[contains(text(),\"Account Generated Successfully!!!\")]")).getText();
//			System.out.println("confirmation text is "+status);
//			String acdetails=driver.findElement(By.xpath("//*[contains(text(),\"Created Account details are as follows:\")]")).getText();
//			System.out.println("text is "+acdetails);
//			String acid=driver.findElement(By.xpath("//*[contains(text(),\"Account ID\")]")).getText();
//			System.out.println("text is "+acid);
//			String acnum=driver.findElement(By.xpath("//*[contains(text(),\"125675\")]")).getText();
//			System.out.println("Account Id is "+acnum);
//			String cusid=driver.findElement(By.xpath("//*[contains(text(),\"Customer ID\")]")).getText();
//			System.out.println("text is "+cusid);
//			String cusnum=driver.findElement(By.xpath("//*[contains(text(),\"78732\")]")).getText();
//			System.out.println("Customer Id is "+cusnum);
//			String cusname=driver.findElement(By.xpath("//*[contains(text(),\"Customer Name\")]")).getText();
//			System.out.println("text is "+cusname);
//			String name=driver.findElement(By.xpath("//*[contains(text(),\"ABC\")]")).getText();
//			System.out.println("Customer name is "+name);
//			String email=driver.findElement(By.xpath("//*[contains(text(),\"Email\")]")).getText();
//			System.out.println("text is "+email);
//			String gmail=driver.findElement(By.xpath("//*[contains(text(),\"keerthimurali697@gmail.com\")]")).getText();
//			System.out.println("Gmail is "+gmail);
//			String actype=driver.findElement(By.xpath("//*[contains(text(),\"Account Type\")]")).getText();
//			System.out.println("Text is "+actype);
//			String type=driver.findElement(By.xpath("//*[contains(text(),\"Current\")]")).getText();
//			System.out.println("Account type is "+type);
//			String doo=driver.findElement(By.xpath("//*[contains(text(),\"Date of Opening\")]")).getText();
//			System.out.println("Text is"+doo);
//			String date=driver.findElement(By.xpath("//*[contains(text(),\"2023-08-13\")]")).getText();
//			System.out.println("Date is "+date);
//			String text=driver.findElement(By.xpath("//*[contains(text(),\"Current Amount\")]")).getText();
//			System.out.println("Text is "+text);
//			String amount=driver.findElement(By.xpath("//*[@id=\"account\"]//*[contains(text(),\"1500\")]")).getText();
//			System.out.println("Current Amount is"+amount);
//			String var="//*[@id=\\\"account\\\"]//tr[value]\";
			
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