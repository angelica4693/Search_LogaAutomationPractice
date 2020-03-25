package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excelutility.Excel;

public class Login 
{
	WebDriver driver;
	public void Launch(String URL)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Searchautomation\\Searchautomation\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get(URL);
	}
	public void Signin(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
	}
	public void usernameandpassword(int i) throws IOException
	{
		Excel e=new Excel();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(e.excel_username(i));
		WebElement d = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		d.click();
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys(e.excel_password(i));
		WebElement f = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		f.click();
	
	}
	public void Click(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
	}
	
	
	}




