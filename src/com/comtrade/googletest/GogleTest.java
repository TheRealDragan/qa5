package com.comtrade.googletest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class GogleTest {

	@Test
	void testLogoPresence() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neman\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		boolean logoPresent = driver.findElement(By.id("hplogo")).isDisplayed();
		driver.close();
		assertTrue(logoPresent);
	}




}
