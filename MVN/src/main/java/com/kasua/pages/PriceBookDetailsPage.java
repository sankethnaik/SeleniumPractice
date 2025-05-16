package com.kasua.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriceBookDetailsPage {

@FindBy(id = "value_Price Book Name")
private WebElement createdPriceBook;
public PriceBookDetailsPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getCreatedPriceBook() {
	return createdPriceBook;
}

}
