package com.kasua.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCampaign {
	
	@FindBy(xpath="//input[@name='property(Campaign Name)']")
	private WebElement campaignName;
	
	@FindBy(xpath="//input[@name='property(Start Date)']")
	private WebElement startDate;
	
	@FindBy(xpath="//input[@name='property(End Date)']")
	private WebElement endDate;
	
	@FindBy(xpath="//input[@name='property(Expected Revenue)']")
	private WebElement expRevenue;
	
	@FindBy(xpath="//input[@value='Save']")
	private WebElement saveBtn;
	
	public CreateNewCampaign(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setCampaignName(String campaign) {
		campaignName.sendKeys(campaign);
	}
	
	public void setStartDate(String start) {
		startDate.sendKeys(start);
	}
	
	public void setEndDate(String end) {
		endDate.sendKeys(end);
	}
	
	public void setExpRevenue(String string) {
		expRevenue.sendKeys(string);
	}
	
	public void setSaveBtn() {
		saveBtn.click();
	}

}
