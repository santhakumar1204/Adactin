package com.suriya;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_practice {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTHA KUMAR\\eclipse-workspace\\Adactin_project\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
	WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
	sign.click();
	WebElement login = driver.findElement(By.name("email"));
	login.sendKeys("kumar1204@gmail.com");
	WebElement pass = driver.findElement(By.name("passwd"));
	pass.sendKeys("kumar@1204");
	WebElement submit= driver.findElement(By.name("SubmitLogin"));
	submit.click();
	WebElement shirt= driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
	shirt.click();
	WebElement dre= driver.findElement(By.xpath("(//a[@title='Faded Short Sleeve T-shirts'])[2]"));
	dre.click();
	WebElement plus= driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
	plus.click();
	WebElement size= driver.findElement(By.name("group_1"));
	Select s = new Select(size);
	s.selectByValue("3");
	WebElement add= driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
	add.click();
	WebElement pro= driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
	pro.click();
	WebElement proc= driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
	proc.click();
	WebElement proce= driver.findElement(By.name("processAddress"));
	proce.click();
	WebElement radio= driver.findElement(By.name("cgv"));
	radio.click();
	WebElement pr= driver.findElement(By.name("processCarrier"));
	pr.click();
	WebElement pay= driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
	pay.click();
	WebElement sub= driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	sub.click();
	WebElement back= driver.findElement(By.xpath("//a[@title='Back to orders']"));
	back.click();
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\SANTHA KUMAR\\eclipse-workspace\\Adactin_project\\screenshot\\automation.png");
	FileUtils.copyFile(src, dest);
	WebElement signout = driver.findElement(By.xpath("//a[@title='Log me out']"));
	signout.click();
}
}
