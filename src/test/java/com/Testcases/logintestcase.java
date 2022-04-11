package com.Testcases;


import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Baseclass.App_launch;
import com.Pages.admin_page;
import com.Pages.page1;
import com.Selenium_Resuable.Reusable;
public class logintestcase extends App_launch {
	page1 p;
	
	Reusable r;
	admin_page a;
	@BeforeTest
	private void startup()
	{
		launch("Firefox","https://opensource-demo.orangehrmlive.com/index.php/");
	}

	@Test(priority=1)
	public void login1()
	{
		p= new page1(driver1);
		p.login("Admin", "admin123");
	}
	@Test(priority=2)
	public void job_menu() throws InterruptedException
	{
		a= new admin_page(driver1);
		a.admin_job_title();	
	}
	@AfterTest
		public void close() throws IOException {
		// TODO Auto-generated method stub
		r= new Reusable();
		r.takescreenshot("D:\\testing\\login.png",driver1);
		quit();
	}
	
}
