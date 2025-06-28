package basics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DemoDashboards {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://192.168.126.128:8080");
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@title='Sign In']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Dashboards']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Add Component']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='*Component Name:']/following-sibling::td/child::input")).sendKeys("New Component");
		WebElement lstBox = driver.findElement(By.name("srcReport"));
		Select s=new Select(lstBox);
		s.selectByVisibleText("Key Accounts");
		driver.findElement(By.xpath("//input[@value='Next']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Finish']")).click();
		Thread.sleep(2000);
		String edbname = driver.findElement(By.xpath("//td[.='New Component']")).getText();
		Assert.assertEquals(edbname, "New Component");
		//driver.findElement(By.partialLinkText("Logout")).click();
		//driver.quit();
		driver.findElement(By.xpath("//td[text()='New Component']/../td[2]/a[text()='Del']")).click();Thread.sleep(2000);
		Alert a=driver.switchTo().alert();Thread.sleep(2000);
		a.accept();
		
	}

}
