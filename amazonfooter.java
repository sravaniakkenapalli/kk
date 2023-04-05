package javaproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonfooter {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\srika\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//*[@id=\"navFooter\"]")).click();
		// driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/ul/li[12]/a")).click();
		Actions abc = new Actions(driver);
		//abc.keyUp(Keys.END);
		abc.keyDown(Keys.END);
		
		// List<WebElement> footer= driver.findElements(By.xpath("(//div[@class='navLeftFooter nav-sprite-v1'])"));
		WebElement opentabs = driver.findElement(By.xpath("(//div[@id='navFooter'])"));
		System.out.println(opentabs.findElements(By.tagName("a")).size());
		{
		for ( int i=1;i<opentabs.findElements(By.tagName("a")).size();i++)
		 {
	
		String opentabsagain = Keys.chord(Keys.CONTROL,Keys.ENTER);
		opentabs.findElements(By.tagName("a")).get(i).sendKeys(opentabsagain);
		
		 }
		 
		 
			 
				 
		 
				
		
		
	}
	}
}
		
		
		
		
