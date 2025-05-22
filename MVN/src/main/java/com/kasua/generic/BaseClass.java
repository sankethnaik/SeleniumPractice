package com.kasua.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.kasua.pages.HomePage;
import com.kasua.pages.LoginPage;

public class BaseClass {

	public WebDriver driver;
	public FileLib f=new FileLib();
	@BeforeTest
	public void openBrowser() {
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}	
	@AfterTest
	public void closeBrowser() {
		Reporter.log("closeBrowser",true);	
		driver.quit();
	}	
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("login",true);
		String url = f.getPropertyData("url");
		driver.get(url);
		String un = f.getPropertyData("username");
		String pwd = f.getPropertyData("password");
		LoginPage l=new LoginPage(driver);
		l.login(un,pwd);
	}		@AfterMethod
	public void logOut() {
		HomePage h=new HomePage(driver);
		h.setLogout();
		Reporter.log("logOut",true);
	}


}
