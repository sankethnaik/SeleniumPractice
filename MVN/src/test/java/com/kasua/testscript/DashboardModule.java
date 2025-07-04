package com.kasua.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kasua.generic.BaseClass;
import com.kasua.pages.DashboardsPage;
import com.kasua.pages.HomePage;

import basics.DemoDashboards;

public class DashboardModule extends BaseClass {
	
	@Test
	public void createDashBoard() throws EncryptedDocumentException, IOException, InterruptedException {
		String expectedComponent = f.getExcelData("Dashboards",1,0);
		System.out.println(expectedComponent);
		String expReport=f.getExcelData("Dashboards",1,1);
		System.out.println(expReport);
		
		HomePage h=new HomePage(driver);
		h.getDashboardLink().click();
		
		DashboardsPage d=new DashboardsPage(driver);
		WebElement ac = d.getAddComponent();
		ac.click();
		d.setEnterCompName(expectedComponent);
		
		WebElement lstBox = d.getSrcReport();
		Select s=new Select(lstBox);
		
		s.selectByVisibleText(expReport);Thread.sleep(2000);
		d.setClickNext();Thread.sleep(2000);
		d.setClickFinish();Thread.sleep(2000);
		String edb = d.getEdbname();
		Assert.assertEquals(edb, expectedComponent);
		
		d.setDeletedb();Thread.sleep(3000);
		Alert a=driver.switchTo().alert();Thread.sleep(3000);
		a.accept();Thread.sleep(3000);
	}
	
	

}
