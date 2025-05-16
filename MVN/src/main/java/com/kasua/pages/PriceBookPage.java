package com.kasua.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriceBookPage {
@FindBy(xpath = "//input[@value='New Price Book']")
private WebElement newPriceBookBtn;

public PriceBookPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setNewPriceBookBtn() {
	newPriceBookBtn.click();
}
}
