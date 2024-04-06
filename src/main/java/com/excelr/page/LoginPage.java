package com.excelr.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excelr.base.ExcelRBase;
import com.excelr.utility.ScreenshotDemo;

public class LoginPage extends ExcelRBase {
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public boolean login() {
		ScreenshotDemo.captureScreenshot(driver, "Login TC");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		return driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
	}
	
	
	
}
