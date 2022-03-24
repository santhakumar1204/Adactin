package com.suriya;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_creation {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTHA KUMAR\\eclipse-workspace\\Adactin_project\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
	WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
	sign.click();
	WebElement crt = driver.findElement(By.name("email_create"));
	crt.sendKeys("kumar1204@gmail.com");
	WebElement create = driver.findElement(By.name("SubmitCreate"));
	create.click();
	WebElement mr = driver.findElement(By.id("id_gender1"));
	mr.click();
	WebElement frst = driver.findElement(By.id("customer_firstname"));
	frst.sendKeys("santhakumar");
	WebElement last = driver.findElement(By.name("customer_lastname"));
	last.sendKeys("R");
	WebElement pass = driver.findElement(By.name("passwd"));
	pass.sendKeys("kumar@1204");
	WebElement day = driver.findElement(By.name("days"));
	Select s = new Select(day);
	s.selectByValue("12");
	WebElement month = driver.findElement(By.name("months"));
	Select s1 = new Select(month);
	s1.selectByValue("4");
	WebElement yr = driver.findElement(By.name("years"));
	Select s2 = new Select(yr);
	s2.selectByValue("2000");
	WebElement add = driver.findElement(By.name("address1"));
	add.sendKeys("12/259,kurukku street");
	WebElement cit = driver.findElement(By.name("city"));
	cit.sendKeys("kanyakumari");
	WebElement state = driver.findElement(By.name("id_state"));
	Select s3= new Select(state);
	s3.selectByValue("14");
	WebElement code = driver.findElement(By.name("postcode"));
	code.sendKeys("62970");
	WebElement hphone = driver.findElement(By.name("phone"));
	hphone.sendKeys("987654321");
	WebElement phone = driver.findElement(By.name("phone_mobile"));
	phone.sendKeys("98765432");
	WebElement reg = driver.findElement(By.name("submitAccount"));
	reg.click();
	
}
}
