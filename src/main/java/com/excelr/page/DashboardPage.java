package com.excelr.page;

import org.openqa.selenium.By;

import com.excelr.base.ExcelRBase;

public class DashboardPage extends ExcelRBase{

	public boolean getTimeWorkSection() {
		return driver.findElement(By.xpath("//p[text()='Time at Work']")).isDisplayed();
	}
}
