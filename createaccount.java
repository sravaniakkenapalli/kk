package javaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class createaccount {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\srika\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@rel='async'])")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//input[@name='firstname'])")).sendKeys("Ricky");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abcde");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("9110378637");
		driver.findElement(By.xpath("(//select[@name='birthday_day'])")).sendKeys("20");
		driver.findElement(By.xpath("(//select[@name='birthday_month'])")).sendKeys("Feb");
		driver.findElement(By.xpath("(//select[@name='birthday_year'])")).sendKeys("2019");
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
		
		
		

		
		
		


		
		
		
		
		
		
		
		

	}

}
