package com.kasua.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePriceBookPage {
@FindBy(name="property(Price Book Name)")
private WebElement priceBookNameTbx;
@FindBy(xpath="//input[@value='Save']")
private WebElement saveBtn;

public CreatePriceBookPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void createPriceBook(String priceBook) {
	priceBookNameTbx.sendKeys(priceBook);
	saveBtn.click();
}
}
