package com.hrm.PageTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.BaseTest.TestBase;
import com.hrm.Pages.HomePage;
import com.hrm.Pages.LoginPage;
@Test
public class LoginTestCase extends TestBase{
LoginPage loginpage;
HomePage homePage;
	public LoginTestCase() throws IOException {
		super();
	}
@BeforeMethod
public void setUp() throws IOException {
	initializetion();
	loginpage=new LoginPage();
	homePage=new HomePage();
}
@Test(priority=1)
public void getTitel(){
	String Titel=loginpage.ValidategetPageTatils();

Assert.assertEquals(Titel, "OrangeHRM");
}
@Test(priority=2)
public void LoginTest(){
	loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
}

		
@AfterMethod
public void teardown(){
driver.quit();
}
}
