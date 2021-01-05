package com.hrm.BaseTest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hrm.util.Testutil;

public class TestBase {
	//POM page Object model design pattern approach
	//Data Driven Framework +TestNG	
	//Parent Class
public static WebDriver driver;
public static Properties prop;
public TestBase() throws IOException {
		prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\harish\\workspace\\POM\\src_main_java\\com\\hrm\\config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

public static void initializetion(){
String browserName=prop.getProperty("browser");
if(browserName.equals("firefox")){
System.setProperty("webdriver.gecko.driver", "C:\\Users\\harish\\Desktop\\Selenium\\chromedriver_win32\\geckodriver-v\\geckodriver.exe");
driver=new FirefoxDriver();
}else if(browserName.equals("chrome")){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\harish\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
}
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
driver.get(prop.getProperty("url"));
} 
	
}
