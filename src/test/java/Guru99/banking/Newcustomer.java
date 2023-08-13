package Guru99.banking;

import org.openqa.selenium.By;

public class Newcustomer extends Basetest {

	public static void main(String[] args) {
		try {
      Newcustomer nc = new Newcustomer();
      nc.login();
      Thread.sleep(2000);
      nc.customerdata("IVY", 'f', "04/14/2000", "abc", "abc", "abc", "522403", "1234567890", "ivy@gmail.com", "abcd");
      nc.displaycustomerdetails();
      Thread.sleep(2000);
      nc.customerdata("IVY comptech", 'f', "05/14/2000", "abc", "abc", "abc", "522403", "1234567891", "ivycomptech@gmail.com", "abcd");
      nc.displaycustomerdetails();
      Thread.sleep(2000);
      nc.customerdata("Entain", 'f', "06/14/2000", "abc", "abc", "abc", "522403", "1234567892", "entain@gmail.com", "abcd");
      nc.displaycustomerdetails();
//      driver.findElement(By.xpath("//*[contains(text(),\"New Customer\")]")).click();
//      Thread.sleep(2000);
//      driver.findElement(By.xpath("//*[@name=\"name\"]")).sendKeys("Meghana");
//      driver.findElement(By.xpath("//*[@name=\"rad1\" and @value=\"f\"]")).click();
//      driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("04/14/2000"); 
//      driver.findElement(By.xpath("//*[@name=\"addr\"]")).sendKeys("501,Sanjeevanitowers");
//      driver.findElement(By.xpath("//*[@name=\"city\"]")).sendKeys("Sattenapalli");
//      driver.findElement(By.xpath("//*[@name=\"state\"]")).sendKeys("3capitals");
//      driver.findElement(By.xpath("//*[@name=\"pinno\"]")).sendKeys("522403");
//      driver.findElement(By.xpath("//*[@name=\"telephoneno\"]")).sendKeys("9985161044");
//      driver.findElement(By.xpath("//*[@name=\"emailid\"]")).sendKeys("abc@gmail.com");
//      driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("abcd");
//      driver.findElement(By.xpath("//*[@name=\"sub\"]")).click();
      // print success message along with cusid
      driver.quit();
      
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
public void customerdata (String username, char gender, String DOB, String address, String cityname, String capital, String pincode, String mobilenum, String mail, String password )
{
	try {
	driver.findElement(By.xpath("//*[contains(text(),\"New Customer\")]")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@name=\"name\"]")).sendKeys(username);
    driver.findElement(By.xpath("//*[@name=\'rad1\' and @value=\'"+gender+"\']")).click();
    driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys(DOB); 
    driver.findElement(By.xpath("//*[@name=\"addr\"]")).sendKeys(address);
    driver.findElement(By.xpath("//*[@name=\"city\"]")).sendKeys(cityname);
    driver.findElement(By.xpath("//*[@name=\"state\"]")).sendKeys(capital);
    driver.findElement(By.xpath("//*[@name=\"pinno\"]")).sendKeys(pincode);
    driver.findElement(By.xpath("//*[@name=\"telephoneno\"]")).sendKeys(mobilenum);
    driver.findElement(By.xpath("//*[@name=\"emailid\"]")).sendKeys(mail);
    driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys(password);
    driver.findElement(By.xpath("//*[@name=\"sub\"]")).click();
	}
	catch (Exception e)
	{
		System.out.println(e);
	}

}
public void displaycustomerdetails() {
	String status = driver.findElement(By.xpath("//*[@id=\"customer\"]//tr[1]")).getText();
	System.out.println("Status is "+status);
	String text = driver.findElement(By.xpath("//*[@id=\"customer\"]//tr[2]")).getText();
	System.out.println("Contains "+text);
	String customerid = driver.findElement(By.xpath("//*[@id=\"customer\"]//tr[4]")).getText();
	System.out.println("Contains "+customerid);
	String customername = driver.findElement(By.xpath("//*[@id=\"customer\"]//tr[5]")).getText();
	System.out.println("Contains "+customername);
	String gender = driver.findElement(By.xpath("//*[@id=\"customer\"]//tr[6]")).getText();
	System.out.println("Contains "+gender);
	String dob = driver.findElement(By.xpath("//*[@id=\"customer\"]//tr[7]")).getText();
	System.out.println("Contains "+dob);
	String address = driver.findElement(By.xpath("//*[@id=\"customer\"]//tr[8]")).getText();
	System.out.println("Contains "+address);
	String city = driver.findElement(By.xpath("//*[@id=\"customer\"]//tr[9]")).getText();
	System.out.println("Contains "+city);
	String state = driver.findElement(By.xpath("//*[@id=\"customer\"]//tr[10]")).getText();
	System.out.println("Contains "+state);
	String pin = driver.findElement(By.xpath("//*[@id=\"customer\"]//tr[11]")).getText();
	System.out.println("Contains "+pin);
	String mobilennum = driver.findElement(By.xpath("//*[@id=\"customer\"]//tr[12]")).getText();
	System.out.println("Contains "+mobilennum);
	String email = driver.findElement(By.xpath("//*[@id=\"customer\"]//tr[13]")).getText();
	System.out.println("Contains "+email);
}




}
