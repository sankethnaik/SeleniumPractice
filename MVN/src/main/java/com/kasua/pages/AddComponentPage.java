package com.kasua.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddComponentPage {
	
	@FindBy(xpath="//td[text()='*Component Name:']/following-sibling::td/child::input")
	private WebElement compName;
	
	@FindBy(name="srcReport")
	private WebElement srcReport;
	
	@FindBy(xpath="//input[@value='Next']")
	private WebElement clickBtn;
	
	@FindBy(xpath="//input[@value='Finish']")
	private WebElement finishBtn;
	
	public AddComponentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setCompName(String comp) {
		compName.sendKeys(comp);
	}
	
	public WebElement getSrcReport() {
		return srcReport;
	}
	
	public void setClickBtn() {
		clickBtn.click();
	}
	
	public void setFinishBtn() {
		finishBtn.click();
	}
	

}
