package com.bjs.Orange;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class OrangeDemo {

	public static void main(String[] args) throws InterruptedException, IOException   {
	

FileInputStream  fis = new FileInputStream("D:\\core java\\HybridDrivenFramework\\src\\com\\bjs\\utilities\\hybridframework.properties");
 Properties p = new Properties();
 p.load(fis);
		
	String  urlData = p.getProperty("urlData");	
	String  usernameData = p.getProperty("usernameData");
	String Pass = p.getProperty("PasswordData");
 
	String  usernamekey = p.getProperty("usernamekey");		
	String  passwordkey = p.getProperty("passwordkey"); 
	String  submitkey = p.getProperty("submitkey");
		
	System.out.println(urlData);
	System.out.println(usernameData);
 
	System.out.println(Pass);
	
	System.out.println(usernamekey);
	System.out.println(passwordkey);
	System.out.println(submitkey);
	

	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
    driver.get(urlData);
	 
	Thread.sleep(5000);
	driver.findElement(By.xpath(usernamekey)).sendKeys(usernameData);
	driver.findElement(By.xpath(passwordkey)).sendKeys(Pass);
	driver.findElement(By.xpath(submitkey)).click();
  
	
		
	}

}
