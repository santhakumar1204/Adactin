package com.suriya;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Runner_Class {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTHA KUMAR\\eclipse-workspace\\Suriya\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
		sign.click();
		WebElement mail = driver.findElement(By.name("email_create"));
		mail.sendKeys("vija@gmail.com");
		WebElement crt = driver.findElement(By.id("SubmitCreate"));
		crt.click();
		WebElement a = driver.findElement(By.id("id_gender1"));
		a.click();
		WebElement frstname = driver.findElement(By.id("customer_firstname"));
		frstname.sendKeys("vijay");
		WebElement lastname = driver.findElement(By.id("customer_lastname"));
		lastname.sendKeys("kumar");
		WebElement pass = driver.findElement(By.name("passwd"));
		pass.sendKeys("vijay1204");
		WebElement date = driver.findElement(By.name("days"));
		Select s = new Select(date);
		s.selectByValue("12");
		WebElement month = driver.findElement(By.name("months"));
		Select s1 = new Select(month);
		s1.selectByValue("4");
		WebElement yr = driver.findElement(By.name("years"));
		Select s2 = new Select(yr);
		s2.selectByValue("2000");
		WebElement comp = driver.findElement(By.id("company"));
		comp.sendKeys("home");
		WebElement add = driver.findElement(By.name("address1"));
		add.sendKeys("12,nungambakkam,chennai");
		WebElement add2= driver.findElement(By.name("address2"));
		add2.sendKeys("12,nungambakkam,chennai,600001");
		WebElement cit= driver.findElement(By.name("city"));
		cit.sendKeys("chennai");
		WebElement state = driver.findElement(By.name("id_state"));
		Select s3 = new Select(state);
		s3.selectByValue("14");
		WebElement zip = driver.findElement(By.name("postcode"));
		zip.sendKeys("60001");
		WebElement country = driver.findElement(By.name("id_country"));
		Select s4= new Select(country);
		s4.selectByValue("21");
		WebElement b = driver.findElement(By.name("other"));
		b.sendKeys("987654321");
		WebElement hphn = driver.findElement(By.name("phone"));
		hphn.sendKeys("97865432");
		WebElement phn = driver.findElement(By.name("phone_mobile"));
		phn.sendKeys("900000000");
		WebElement sub = driver.findElement(By.name("submitAccount"));
		sub.click();
		WebElement wom = driver.findElement(By.xpath("//a[@title='Women']"));
		wom.click();
		WebElement clik = driver.findElement(By.xpath("(//a[@class='product-name'])[2]"));
		clik.click();
		WebElement cart = driver.findElement(By.name("Submit"));
		cart.click();
		WebElement pro = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		pro.click();
		WebElement proceed = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		proceed.click();
		WebElement pr = driver.findElement(By.name("processAddress"));
		pr.click();
		WebElement aa = driver.findElement(By.name("cgv"));
		aa.click();
		WebElement bb = driver.findElement(By.name("processCarrier"));
		bb.click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\SANTHA KUMAR\\eclipse-workspace\\SeleniumExample\\screenshot\\aaa.png");
		FileUtils.copyFile(src, dest);
				
	}
	
	
	
	
}
