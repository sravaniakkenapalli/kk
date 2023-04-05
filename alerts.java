package javaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class alerts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\srika\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//accept
		driver.findElement(By.name("alertbox")).click();
		
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//dismiss
		driver.findElement(By.name("confirmalertbox")).click();
		Thread.sleep(2000);
		//driver.switchTo().alert().accept();
driver.switchTo().alert().dismiss();
		

String a = driver.findElement(By.id("demo")).getText();
System.out.println(a);
		

	}

}
