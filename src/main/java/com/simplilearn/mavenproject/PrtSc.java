package com.simplilearn.mavenproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils; // FileUtils thực hiện các chức năng đọc, ghi, copy, so sánh file 
import org.openqa.selenium.OutputType; // Thực hiện capture screenshot và lưu trữ tại nơi chỉ định
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class PrtSc extends init {
	public static void Screenshot(WebDriver webdriver, String fileWithPath) throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(fileWithPath); // Tạo DestFile

		FileUtils.copyFile(SrcFile, DestFile); // Chuyển file image từ SrcFile sang DestFile
	}

}
