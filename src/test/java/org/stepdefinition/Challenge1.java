package org.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Challenge1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\work\\Screenshot\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://lh.inmakesedu.com/");
driver.manage().window().maximize();
TakesScreenshot tt = (TakesScreenshot)driver;
File img =tt.getScreenshotAs(OutputType.FILE);
File f = new File("D:\\work\\Screenshot\\Storage\\inmakes.png");
FileUtils.copyFile(img, f);

	}

}
