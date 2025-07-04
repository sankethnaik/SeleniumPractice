package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoFaceBook {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement date = driver.findElement(By.id("day"));
		
		Select s1=new Select(date);
		s1.selectByValue("30");
		WebElement month = driver.findElement(By.id("month"));
		Select s2=new Select(month);
		s2.selectByVisibleText("May");
		
		WebElement year = driver.findElement(By.id("year"));
		Select s3=new Select(year);
		s3.selectByValue("1989");
		
		int y1 = driver.findElement(By.xpath("//label[text()='Female']/child::input")).getLocation().getY();
		int y2 = driver.findElement(By.xpath("//label[text()='Male']/child::input")).getLocation().getY();
		int y3 = driver.findElement(By.xpath("//label[text()='Custom']/child::input")).getLocation().getY();
		
		if(y1==y2 && y1==y3) {
			
			System.out.println("Radio buttons are aligned");			
		}
		
		else {
			System.out.println("Radio buttons are not aligned");
		}
	}

}
