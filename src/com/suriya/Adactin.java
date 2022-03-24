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

public class Adactin {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTHA KUMAR\\eclipse-workspace\\Adactin_project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://adactinhotelapp.com/");
		WebElement log = driver.findElement(By.name("username"));
		log.sendKeys("SanthaKumar");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("269GD0");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		WebElement location = driver.findElement(By.name("location"));
		Select s = new Select(location);
		s.selectByValue("Sydney");
		WebElement hotel = driver.findElement(By.name("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByIndex(2);
		WebElement room = driver.findElement(By.name("room_type"));
		Select s2 = new Select(room);
		s2.selectByValue("Super Deluxe");
		WebElement num = driver.findElement(By.name("room_nos"));
		Select s3 = new Select(num);
		s3.selectByValue("1");
		WebElement in = driver.findElement(By.name("datepick_in"));
		in.sendKeys("12/04/2022");
		WebElement out = driver.findElement(By.name("datepick_out"));
		out.sendKeys("13/04/2022");
		WebElement per = driver.findElement(By.name("adult_room"));
		Select s4 = new Select(per);
		s4.selectByValue("2");
		WebElement child = driver.findElement(By.name("child_room"));
		Select s5 = new Select(child);
		s5.selectByValue("0");
		WebElement search = driver.findElement(By.name("Submit"));
		search.click();
		WebElement radio = driver.findElement(By.name("radiobutton_0"));
		radio.click();
		WebElement conti = driver.findElement(By.name("continue"));
		conti.click();
		WebElement frst = driver.findElement(By.name("first_name"));
		frst.sendKeys("santhakumar");
		WebElement last = driver.findElement(By.name("last_name"));
		last.sendKeys("R");
		WebElement add = driver.findElement(By.name("address"));
		add.sendKeys("12/259,dubai kuruku street,dubai");
		WebElement cc = driver.findElement(By.name("cc_num"));
		cc.sendKeys("1234567890123456");
		WebElement type = driver.findElement(By.name("cc_type"));
		Select s6 = new Select(type);
		s6.selectByValue("VISA");
		WebElement ex = driver.findElement(By.name("cc_exp_month"));
		Select s7= new Select(ex);
		s7.selectByValue("4");
		WebElement yr = driver.findElement(By.name("cc_exp_year"));
		Select s8 = new Select(yr);
		s8.selectByValue("2021");
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		cvv.sendKeys("000");
		WebElement book = driver.findElement(By.name("book_now"));
		book.click();
		WebElement iti = driver.findElement(By.name("my_itinerary"));
		iti.click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\SANTHA KUMAR\\eclipse-workspace\\Adactin_project\\screenshot\\adactin.png");
		FileUtils.copyFile(src, dest);
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		logout.click();
			
			
		}
		
		
	}


