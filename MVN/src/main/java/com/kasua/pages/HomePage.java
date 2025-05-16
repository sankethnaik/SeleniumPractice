package com.kasua.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath = "//div[@id='tabcontainer']/descendant::a[text()='Price Books']")
private WebElement priceBookLink;
@FindBy(id="scrollright")
private WebElement scrollRightBtn;
@FindBy(partialLinkText ="Logout")
private WebElement logoutLink;
public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getPriceBookLink() {
	return priceBookLink;
}
public WebElement getScrollRightBtn() {
	return scrollRightBtn;
}
public void setLogout() {
	logoutLink.click();
}

}
