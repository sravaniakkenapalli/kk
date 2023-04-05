package javaproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class tableelement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\srika\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.libas.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String count=driver.findElement(By.xpath("(//footer[@class='site-footer'])")).getText();
		System.out.println(count);
		
		
		
		
		

		}
	
		
	
		
		

	}
	


