package com.kasua.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.kasua.generic.BaseClass;
import com.kasua.pages.CampaignsPage;
import com.kasua.pages.CreateNewCampaign;
import com.kasua.pages.HomePage;

public class CampaignModule extends BaseClass {
	
	@Test(retryAnalyzer = RetryMechanism.class)
	
	public void createCampaign() throws EncryptedDocumentException, IOException, InterruptedException {
		String expectedCampaign = f.getExcelData("CreateCampaign",1,0);
		
		System.out.println(expectedCampaign);
		
		String expStartDate=f.getExcelData("CreateCampaign",1,1);
		System.out.println(expStartDate);
		String expEndDate=f.getExcelData("CreateCampaign",1,2);
		System.out.println(expEndDate);
		//String expRevenue=f.getExcelData("CreateCampaign",1,3);
		//System.out.println(expRevenue);
		
		HomePage h=new HomePage(driver);
		WebElement campaigns= h.getCampaignLink();
		campaigns.click();
		
		CampaignsPage c=new CampaignsPage(driver);
		c.setNewCampaignBtn();Thread.sleep(2000);
		
		CreateNewCampaign n=new CreateNewCampaign(driver);
		n.setCampaignName(expectedCampaign);Thread.sleep(2000);
		n.setStartDate(expStartDate);Thread.sleep(2000);
		n.setEndDate(expEndDate);Thread.sleep(2000);
		n.setExpRevenue("100000");
		n.setSaveBtn();Thread.sleep(2000);
	}

}
