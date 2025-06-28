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

@FindBy(xpath="//a[text()='Campaigns']")
private WebElement campaignLink;

@FindBy(xpath="//a[text()='Dashboards']")
private WebElement dashboardLink;

@FindBy(xpath="//input[@value='Add Component']")
private WebElement addComponent;

@FindBy(partialLinkText ="Logout")
private WebElement logoutLink;

@FindBy(xpath="//a[text()='Dashboards']")
private WebElement dashBoard;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getPriceBookLink() {
	return priceBookLink;
}
public WebElement getScrollRightBtn() {
	return scrollRightBtn;
}

public WebElement getCampaignLink() {
	return campaignLink;
}

public WebElement getDashboardLink() {
	return dashboardLink;
}

public void setAddComponent() {
	addComponent.click();
}

public void setLogout() {
	logoutLink.click();
}

public void setDashBoard() {
	dashBoard.click();
}

}
