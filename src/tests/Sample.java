package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class Sample {

	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.name("firstname")).sendKeys("Lokesh");
		driver.findElement(By.name("lastname")).sendKeys("Gowda");
	}

}

// method - camelCase : getLoginID()
// variable - camelCase : firstName, no underscoRes 
