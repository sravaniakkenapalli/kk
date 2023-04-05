package javaproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class webelements {

	public static void main(String[] args) throws Exception 

{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\srika\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
//driver.get("https://www.libas.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
int count=driver.findElements(By.tagName("a")).size();
System.out.println(count);
List<WebElement> a=driver.findElements(By.tagName("a"));
for ( WebElement b:a)
{
	String link=b.getText();
	System.out.println(link);
}
	}

}
