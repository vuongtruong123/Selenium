package com.simplilearn.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class DefindElement extends init{

	
	public void RedirectToLoginPage() {
		driver.findElement(By.id("dang-nhap")).click();
	}

	public void textbox_phone(String phone) {
		driver.findElement(By.id("phone-input-login")).clear();
		driver.findElement(By.id("phone-input-login")).sendKeys(phone);
	}

	public void textbox_password(String password) {
		driver.findElement(By.id("password-input")).clear();
		driver.findElement(By.id("password-input")).sendKeys(password);
	}

	public void btn_login() {
		driver.findElement(By.xpath("//button[contains(.,'Đăng nhập')]")).click();
	}
}
