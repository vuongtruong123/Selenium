package com.simplilearn.mavenproject;


import static org.junit.jupiter.api.Assertions.*;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.simple.parser.ParseException;

public class Testcase extends init {
    
  @org.testng.annotations.Test
	public void login() throws InterruptedException, IOException, ParseException{

		//setup enviroment selenium
		setup();
		
		//Create object data test
		ReadJsonFile data = new ReadJsonFile();
		
		//get data for login testcase
		String phone = "";
		String password = "";
		phone = data.ReadJS().get("username").toString();
		password = data.ReadJS().get("password").toString();
		
		//create object element
		DefindElement define_element = new DefindElement();
		
		// call element
		define_element.RedirectToLoginPage();
		Thread.sleep(1000);
		define_element.textbox_phone(phone);
		define_element.textbox_password(password);
		define_element.btn_login();

		// assertion
		String actualUrl = "https://fptplay.vn/";
		Thread.sleep(2000);
		//Screenshot
		Date date = new Date(); // This object contains the current date value
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		PrtSc.Screenshot(driver, "D:/evidence/" + String.valueOf(formatter.format(date)) + "-" + String.valueOf(System.currentTimeMillis()) + ".png");
		assertEquals(driver.getCurrentUrl(), actualUrl);
		
		//end Testcase
		endProcess();
	}
}
