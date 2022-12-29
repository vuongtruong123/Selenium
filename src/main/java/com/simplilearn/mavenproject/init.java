package com.simplilearn.mavenproject;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class init {
	public static WebDriver driver;
	
	public void setup() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://fptplay.vn");
	}
	
	
	public void endProcess() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}