package com.excelr.base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ExcelRBase {

	public static WebDriver driver;
	public static Properties prop;

	public void initialization() {
		readPropertyFile();
		String browsername = prop.getProperty("browser");

		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void tearDown() {
		driver.quit();
	}

	public void readPropertyFile() {
		String configPath = "./src/main/java/com/excelr/config/config.properties";
		try {
			FileReader reader = new FileReader(configPath);
			prop = new Properties();
			prop.load(reader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
