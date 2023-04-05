package javaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class instagramlogin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\srika\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://instagram.com");
		driver.manage().window().maximize();
		//Thread.sleep(4000);
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
	driver.findElement(By.name("username")).sendKeys("Adhvik");
		driver.findElement(By.name("password")).sendKeys("45673");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@type='submit'])")).click();
		

	}

}
