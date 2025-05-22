import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CampaignModule {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://192.168.126.128:8080/");
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@title='Sign In']")).click();
		driver.findElement(By.xpath("//a[text()='Campaigns']")).click();
		driver.findElement(By.xpath("//input[@value='New Campaign']")).click();
		driver.findElement(By.xpath("//input[@name='property(Campaign Name)']")).sendKeys("Maven test1");
		driver.findElement(By.xpath("//input[@name='property(Start Date)']")).sendKeys("05/20/2025");
		driver.findElement(By.xpath("//input[@name='property(End Date)']")).sendKeys("06/20/2025");
		driver.findElement(By.xpath("//input[@name='property(Expected Revenue)']")).sendKeys("100000");
		//driver.findElement(By.xpath("//input[@value='Save']")).click();
	//	driver.findElement(By.partialLinkText("Logout"));
		
		
	}

}
