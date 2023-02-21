package com.Junit_Gitpull;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestAmazon
{
	
	static WebDriver site;

	@Test
	public void browserLaunch() 
	{
		WebDriverManager.chromedriver().setup();
		site = new ChromeDriver();
		site.manage().window().maximize();
	}

	@Test
	public void amazonLaunch() 
	{
		site.get("https:\\www.amazon.in");
	}

	@Test
	public void searchMobile() 
	{
		site.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("iphone 14");
		site.findElement(By.id("nav-search-submit-button")).click();
	}

	@Test
	public void order() throws InterruptedException 
	{
		site.findElement(By.xpath("//span[text()='Apple iPhone 14 Plus 128GB Starlight']")).click();
		Thread.sleep(5000);
		
		site.quit();

	}
	


}
