package com.excelr.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.excelr.page.LoginPage;

public class LoginPageTest {

	LoginPage lp;

	@BeforeMethod
	public void browserSetup() {
		lp = new LoginPage();
		lp.initialization();
	}

	@Test
	public void validateTitleTest() {
		String expTitle = "OrangeHRM";
		String actTitle = lp.getPageTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	
	@Test
	public void validateLoginTest() {
		Assert.assertTrue(lp.login());
	}

	@AfterMethod
	public void closeBrowser() {
		lp.tearDown();
	}
}
