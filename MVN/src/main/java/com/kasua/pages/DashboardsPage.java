package com.kasua.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardsPage {
	
	@FindBy(xpath="//input[@value='Add Component']")
	private WebElement addComponent;
	
	@FindBy(xpath="//td[text()='*Component Name:']/following-sibling::td/child::input")
	private WebElement enterCompName;
	
	@FindBy(name="srcReport")
	private WebElement srcReport;
	
	@FindBy(xpath="//input[@value='Next']")
	private WebElement clickNext;

	public DashboardsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getAddComponent() {
		return addComponent;
	}
	
	public void setEnterCompName(String comp) {
		enterCompName.sendKeys(comp);
	}
	
	public void getSrcReport() {
		srcReport.click();
	}
	
	public void setClickNext() {
		clickNext.click();
	}
	

}
