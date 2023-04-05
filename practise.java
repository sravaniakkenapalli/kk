package javaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\srika\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.instagram.com/");

		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("ABCD");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("(//button[@type='submit'])")).click();
	}

}
