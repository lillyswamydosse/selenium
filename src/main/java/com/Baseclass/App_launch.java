package com.Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App_launch {
	protected WebDriver driver1;
	public void launch(String driver, String url)
	{
	try
	{
		if(driver.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver1= new ChromeDriver();
			
		}
		else if(driver.equals("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver1= new FirefoxDriver();
			
		}
		driver1.get(url);
		driver1.manage().window().maximize();
	}
catch(Exception e)
	{
	System.out.println(e);
	}
	
}
	public void quit()
	{
		driver1.close();
	}
}