package com.hrm.util;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.hrm.BaseTest.TestBase;

public class Testutil extends TestBase{

	public Testutil() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
public 	static long PAGE_LOAD_TIMEOUT=20;
public static long IMPLICIT_WAIT=10;
public static String filepath="";
public void switchtofram(){
	driver.switchTo().frame("mainfram");
}
@DataProvider
public void getExcel(){

}
}
