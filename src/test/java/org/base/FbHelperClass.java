package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbHelperClass {
	
	public static WebDriver driver;
	
	public static void lauchBrowser() {
	
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
	}
	
	public static void loadUrl(String url) {
	
		driver.get(url);

	}
	
	public static void maxBrowser() {
	
		driver.manage().window().maximize();
		
	}
	
	public static void fillTextBox(WebElement element, String value) {
	
		element.sendKeys(value);

	}
	
	public static void btnClick(WebElement element) {
	
		element.click();

	}
	
}
