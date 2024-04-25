package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing_Test {

	
	@Test
public void Test() throws InterruptedException {
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
