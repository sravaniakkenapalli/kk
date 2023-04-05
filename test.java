package javaproject;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\srika\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.etsy.com/");
		driver.manage().window().maximize();
Thread.sleep(5000);
		
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//button[contains(text(),'Sign in')])[1]")).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[contains(text(), 'Register')])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='email'])")).sendKeys("mail2akkenapally@gmail.com");
		driver.findElement(By.name("first_name")).sendKeys("bhanu");
		driver.findElement(By.name("password")).sendKeys("bha@34");
		driver.findElement(By.xpath("(//button[@value='register'])")).click();
		
			Thread.sleep(2000);
				WebElement x=driver.findElement(By.id("global-enhancements-search-query"));
				x.sendKeys("furniture");
				x.sendKeys(Keys.ENTER);
					Thread.sleep(3000);
				driver.findElement(By.xpath(("(//h3[contains(text(),'Wood Cat Tree Tower, Cat Climbing Tree, Cat Condo, Wooden Cat Tree, Unique Cat Trees')])"))).click();
				@SuppressWarnings({ "unchecked", "rawtypes" })
				ArrayList A= new ArrayList(driver.getWindowHandles());
				driver.switchTo().window((String)A.get(1));
								
					Thread.sleep(6000);
					System.out.println(driver.getCurrentUrl());
					Select colour = new Select(driver.findElement(By.id("variation-selector-0")));
					colour.selectByIndex(2);
					Thread.sleep(1000);
					driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//span[@class='submit-button-text'])")).click();
		
	}

}
