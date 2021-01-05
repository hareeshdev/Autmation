package com.hrm.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.hrm.BaseTest.TestBase;
//Page Layer or Page lib	
//Object repository
//POM page Object model design pattern approach
//Data Driven Framework +TestNG	
//WebElement and web object identification
//Action methods+ Features
public class LoginPage extends TestBase{

	//Page Factory Annotation/Object Repository
	//@FindBy(id="txtUsername")
	@FindBy(how=How.XPATH,using="//*[@id='txtUsername']")
	WebElement username;
	@FindBy(how=How.XPATH,using="//*[@id='txtPassword']") 
	WebElement password;
	@FindBy(name="Submit")
	WebElement LoginButton;
//custom xpath
//@FindBy(xpath="//htmltage=(@name='Submit')");
//initialization the Page Object or OR		
	public LoginPage() throws IOException {
	//	PageFactory.initElements(driver, this.username,this.password,this.l);
		PageFactory.initElements(driver, this);
	}	
	//Action methods
public String ValidategetPageTatils(){

return driver.getTitle();
}
public String getUrl(){

return driver.getCurrentUrl();
	
}

public void login(String un,String pwd){
	username.sendKeys(un);
	password.sendKeys(pwd);
	LoginButton.click();
	//return new HomePage();
}
}
