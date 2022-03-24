package com.suriya;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTHA KUMAR\\eclipse-workspace\\Adactin_project\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.navigate().to("http://automationpractice.com/index.php");
	WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
	JavascriptExecutor j = (JavascriptExecutor) driver;
    j.executeScript("arguments[0].click();", sign);
    WebElement login = driver.findElement(By.name("email"));
	JavascriptExecutor jj = ((JavascriptExecutor) driver);
	jj.executeScript("arguments[0].value='kumar1204@gmail.com';",login);
	driver.navigate().to(driver.getCurrentUrl());
}
}
