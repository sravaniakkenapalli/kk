package javaproject;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PDP {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\srika\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.etsy.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[contains(text(),'Sign in')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='email'])")).sendKeys("mail2akkenapally@gmail.com");
				driver.findElement(By.xpath("(//input[@name='password'])")).sendKeys("bha@34");
				driver.findElement(By.xpath("(//button[@name='submit_attempt'])")).click();
				Thread.sleep(3000);
				WebElement x=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
				System.out.println(x);
				x.sendKeys("school bags");
				x.sendKeys(Keys.ENTER);
					Thread.sleep(3000);
driver.findElement(By.xpath("(//h3[contains(text(),'Krokodil-Drachen-Schultüte D(r)agobert • eBook&Schnitt')])")).click();
					
					
					
					@SuppressWarnings("rawtypes")
					ArrayList A= new ArrayList(driver.getWindowHandles());
					driver.switchTo().window((String)A.get(1));
					Thread.sleep(6000);
					System.out.println(driver.getCurrentUrl());
					Thread.sleep(3000);
				String P1=driver.findElement(By.xpath("(//p[contains(text(),'₹ 776')])  ")).getText();
				System.out.println(P1);
				String a = (P1.replace("\u20B9","")).replaceAll("\\s","");
//				String a = P1.replaceAll("^[0-9]","");
				int g = Integer.parseInt(a);
				System.out.println(g);
				
				Thread.sleep(3000);

			driver.findElement(By.xpath("(//button[contains(text(),'Add to basket')])")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])")).click();
				Thread.sleep(3000);
//				driver.switchTo().frame("gpay-card-info-placeholder-container");
				driver.findElement(By.xpath("//*[@id=\"checkout\"]/div[1]/div[3]/div[3]/div/form/div[4]/div/div/button/div/div[1]")).click();
				
				String P2 = driver.findElement(By.xpath("(//span[@class='currency-value'])[2]")).getText();
				System.out.println(P2);
				
				String changed = P2.replaceAll("[^.0-9]","");
				System.out.println("itemprice="+changed);
				
				int f=(int)Float.parseFloat(changed);
				System.out.println(f);
				
				if(g==f)
				{
					System.out.println("Both are equal");
					
				}
				
				else 
					System.out.println("Not Equal");
				
				
	}
			}
					
		
		
		
	
		

	


