package javaproject;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Responsecode {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String homepage ="https://www.hottools.com/";
		String url="https://www.hottools.com/sravani";
				HttpURLConnection huc=null;
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\srika\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		huc=(HttpURLConnection)(new URL(url).openConnection());
		huc.setRequestMethod("HEAD");
		huc.connect();
		int statuscode = huc.getResponseCode(); 
		if(statuscode>=200)
		{
			System.out.println(statuscode);
		}
		else {
			System.out.println(statuscode);
		}
	
		}

	}


