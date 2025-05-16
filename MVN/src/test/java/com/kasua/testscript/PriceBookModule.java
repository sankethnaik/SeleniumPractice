package com.kasua.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.kasua.generic.BaseClass;
import com.kasua.pages.CreatePriceBookPage;
import com.kasua.pages.HomePage;
import com.kasua.pages.PriceBookDetailsPage;
import com.kasua.pages.PriceBookPage;
@Listeners(com.kasua.generic.ListenerImplementation.class)
public class PriceBookModule extends BaseClass{
	@Test
public void createPriceBook() throws EncryptedDocumentException, IOException {
		String expectedBookName = f.getExcelData("CreatePriceBook", 1, 0);
		HomePage h=new HomePage(driver);
		WebElement priceBooks = h.getPriceBookLink();
		for(;;) {
			if(priceBooks.isDisplayed()) {
				priceBooks.click();
				break;
			}else {
				h.getScrollRightBtn().click();		}	}
		PriceBookPage p=new PriceBookPage(driver);
		p.setNewPriceBookBtn();
		CreatePriceBookPage c=new CreatePriceBookPage(driver);
		c.createPriceBook(expectedBookName);
		PriceBookDetailsPage d=new PriceBookDetailsPage(driver);
		String actualBookName =d.getCreatedPriceBook().getText();
		Assert.assertEquals(actualBookName, expectedBookName);
		Reporter.log(actualBookName,true);
}
}
