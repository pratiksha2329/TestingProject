package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class AccountOrder {
	public static void main(String[] args) {
		 RemoteWebDriver driver  = new ChromeDriver();
		 driver.get("http://practice.automationtesting.in/");

		 driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/my-account/']")).click();
		 
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pratikshajadhawar23@gmail.com");
		 driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("9421254720moni");
		 driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();	 
		 
		 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("pratikshajadhawar23@gmail.com");
		 driver.findElement(By.xpath("(//input[@class='woocommerce-Input woocommerce-Input--text input-text'])[2]")).sendKeys("9421254720moni");
		 driver.findElement(By.xpath("//input[@name='login']")).click();	
		 
		 String actualTitle = driver.getTitle();
		 
		 Assert.assertEquals(actualTitle, "My Account – Automation Practice Site");
		 
		 
		} 
}
