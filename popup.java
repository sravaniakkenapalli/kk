package javaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\srika\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		int count=driver.findElements(By.tagName("a")).size();
		System.out.println();
		
		if(count>0)
		{
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("ricky");
		
		}
		
	
		
		}
	}


