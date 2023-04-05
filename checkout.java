package javaproject;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;




public class checkout {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\srika\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.etsy.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//button[contains(text(),'Sign in')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='email'])")).sendKeys("mail2akkenapally@gmail.com");
				driver.findElement(By.xpath("(//input[@name='password'])")).sendKeys("bha@34");
				driver.findElement(By.xpath("(//button[@name='submit_attempt'])")).click();
				Thread.sleep(2000);
				
				WebElement x=driver.findElement(By.id("global-enhancements-search-query"));
				x.sendKeys("bags");
				x.sendKeys(Keys.ENTER);
					Thread.sleep(3000);
					driver.findElement(By.xpath("(//h3[contains(text(),'Indian Hand Block Print Cotton Quilted Tote Bag | Shoulder Bag | Perfect for gifts, christmas present, travel')]) ")).click();
					
					ArrayList A= new ArrayList(driver.getWindowHandles());
					driver.switchTo().window((String)A.get(1));
									
						Thread.sleep(6000);
						System.out.println(driver.getCurrentUrl());
}
}
