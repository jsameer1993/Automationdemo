package com.bjs.orangehrm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		
		FileInputStream fis = new FileInputStream("D:\\core java\\Datadriven Frameworks\\src\\com\\bjs\\dataproperties\\Datadriven.properties");
		
	Properties p = new Properties();
		
		p.load(fis);
	
		String url = p.getProperty("url");
		
		
		String username = p.getProperty("Username");
		
		String  password = p.getProperty("Password");
		
		
		 
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	 
		
	 	 		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
 
		
	}

}
