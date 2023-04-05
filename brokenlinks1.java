package javaproject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class brokenlinks1 {

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			String homepage = "https://www.amazon.in/";
			String url = ""; 
			HttpURLConnection huc = null;
			System.setProperty("webdriver.edge.driver","C:\\Users\\srika\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.get(homepage);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.get(homepage);
			List<WebElement> links = driver.findElements(By.tagName("a"));
			Iterator<WebElement> it =links.iterator();
			while(it.hasNext())
			{
				url=it.next().getAttribute("href");
				System.out.println(url);
				if (url==null||url.isEmpty())
						{
					System.out.println("It is an Empty link");
					continue;
				}
				if(!url.startsWith(homepage)){
				System.out.println("URL belongs to another domain");
					continue;
				}
				try {
					huc=(HttpURLConnection)(new URL(url).openConnection());
					huc.setRequestMethod("HEAD");
					huc.connect();
					int statuscode = huc.getResponseCode(); 
					if(statuscode>200) {
						System.out.println(url+ "is a valid link");}
						else {
						
							System.out.println(url+ "is a Broken link");}
				}
				catch(MalformedURLException e) {
					e.printStackTrace();
				}
				
				
				 catch (IOException e){
							e.printStackTrace();
							}
				}
				driver.quit();
						}
}
				
			