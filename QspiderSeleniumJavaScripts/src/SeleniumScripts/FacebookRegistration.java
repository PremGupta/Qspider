package SeleniumScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("u_0_1")).sendKeys("TestUserFirstname");
		driver.findElement(By.id("u_0_3")).sendKeys("TestUserLastname");
		driver.findElement(By.id("u_0_6")).sendKeys("TestUserLastname@yopmail.com");
		driver.findElement(By.id("u_0_9")).sendKeys("TestUserLastname@yopmail.com");
		driver.findElement(By.id("u_0_d")).sendKeys("TestUserLastname123");

		WebElement day=driver.findElement(By.id("day"));
		Select seday=new Select(day);
		seday.selectByIndex(10);
		
		WebElement month=driver.findElement(By.id("month"));
		Select semonth=new Select(month);
		semonth.selectByVisibleText("Aug");
		
		WebElement year=driver.findElement(By.id("year"));
		Select seyear=new Select(year);
		seyear.selectByVisibleText("2017");
		
		driver.findElement(By.xpath("//input [@id='u_0_k']")).click();
		
		//This is new comment added
		
	}

}
