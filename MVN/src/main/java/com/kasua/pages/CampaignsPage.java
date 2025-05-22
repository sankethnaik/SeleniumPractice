package com.kasua.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignsPage {
	
	@FindBy(xpath="//input[@value='New Campaign']")
	private WebElement newCampaignBtn;
		
	public CampaignsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setNewCampaignBtn() {
		newCampaignBtn.click();
	}
	

}
