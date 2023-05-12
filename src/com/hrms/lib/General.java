package com.hrms.lib;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class General extends Global {
	//standard rule:To provide all reusable fun:/methods of whole application
	public void openApplication() {
	driver = new FirefoxDriver();
	driver.navigate().to(url);
	System.out.println("Application opened");
	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System .out.println("login completed");
	}
	
	public void enterFrame() {
	driver.switchTo().frame("frame_empinfo");
	System.out.println("Enter into frames");
}
	public void addNewEmp() {
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_firstname)).sendKeys(efn);
		driver.findElement(By.name(txt_lastname)).sendKeys(eln);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("New employee added");
	}
	public void editEmp() {
		driver.findElement(By.xpath(btn_edit)).click();
		driver.findElement(By.xpath(btn_back)).click();
		driver.findElement(By.name(checkbox)).click();
		driver.switchTo().defaultContent();
		
		
		
	}
	public void logout()
	{
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
	}
	public void closeApplication()
	{
		driver.close();
		System.out.println("Application closed");
	}
		
		
	}
	
	 


