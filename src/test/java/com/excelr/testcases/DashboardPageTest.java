package com.excelr.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.excelr.page.DashboardPage;
import com.excelr.page.LoginPage;

public class DashboardPageTest {
	
	LoginPage lp;
	DashboardPage dp;

	@BeforeMethod
	public void browserSetup() {
		lp = new LoginPage();
		dp = new DashboardPage();
		lp.initialization();
	}


	@Test
	public void validateTimeWorkTest() {
		lp.login();
		Assert.assertTrue(dp.getTimeWorkSection());
	}
	
	@AfterMethod
	public void closeBrowser() {
		lp.tearDown();
	}
}
