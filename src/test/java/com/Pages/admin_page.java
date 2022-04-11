package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.App_launch;

public class admin_page extends App_launch{
	@FindBy(id=("menu_admin_viewAdminModule"))
	WebElement admin_menu;
	@FindBy(id="menu_admin_Job")
	WebElement admin_job;
	@FindBy(id="menu_admin_viewJobTitleList")
	WebElement admin_job_title;
	public admin_page(WebDriver driver1)
	{
		this.driver1=driver1;
		PageFactory.initElements(driver1,this);
	}
	public void admin_job_title() throws InterruptedException
	{
		Actions act = new Actions(driver1);
		act.moveToElement(admin_menu).perform();
		act.moveToElement(admin_job).perform();
		act.moveToElement(admin_job_title).click().perform();		
		Thread.sleep(3000);
	}
}
