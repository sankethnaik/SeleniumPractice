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
	
	@FindBy(xpath="//input[@value='Finish']")
	private WebElement clickFinish;
	
	@FindBy(xpath="//td[.='New Component']")
	private WebElement edbname;
	
	@FindBy(xpath="//td[text()='New Component']/../td[2]/a[text()='Del']")
	private WebElement deletedb;

	public DashboardsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getAddComponent() {
		return addComponent;
	}
	
	public void setEnterCompName(String comp) {
		enterCompName.sendKeys(comp);
	}
	
	public WebElement getSrcReport() {
		return srcReport;
	}
	
	public void setClickNext() {
		clickNext.click();
	}
	
	public void setClickFinish() {
		clickFinish.click();
	}
	
	public String getEdbname() {
		return edbname.getText();
	}
	
	public void setDeletedb() {
		deletedb.click();
	}

}
