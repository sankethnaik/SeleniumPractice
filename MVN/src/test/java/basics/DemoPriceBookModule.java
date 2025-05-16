package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class DemoPriceBookModule {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://192.168.31.128:8080");
	driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
	driver.findElement(By.id("passWord")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@title='Sign In']")).click();
	WebElement priceBooks = driver.findElement(By.xpath
		("//div[@id='tabcontainer']/descendant::a[text()='Price Books']"));
	for(;;) {
		if(priceBooks.isDisplayed()) {
			priceBooks.click();
			break;
		}else {
			driver.findElement(By.id("scrollright")).click();		}	}
	driver.findElement(By.xpath("//input[@value='New Price Book']")).click();
	driver.findElement(By.name("property(Price Book Name)")).sendKeys("Harry potter");
	driver.findElement(By.xpath("//input[@value='Save']")).submit();
	String bookName = driver.findElement(By.id("value_Price Book Name")).getText();
	Assert.assertEquals(bookName, "Harry potter");
	driver.findElement(By.partialLinkText("Logout")).click();
	driver.quit();
}
}
