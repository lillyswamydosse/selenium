package com.Pages;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.App_launch;

public class page1 extends App_launch {
	@FindBy(id="txtUsername")
	WebElement username;
	@FindBy(id="txtPassword")
	WebElement password;
	@FindBy(id="btnLogin")
	WebElement btclick;
	
public page1(WebDriver driver1)
{
	this.driver1=driver1;
	PageFactory.initElements(driver1,this);
}
public void login(String uname,String pword)
{
	username.sendKeys(uname);
	password.sendKeys(pword);
	btclick.click();
}
}