package org.sample1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTask {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement pop = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		pop.click();
		
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		
		search.sendKeys("iphone 11");
		
		WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
		
		btn.click();
		
		Thread.sleep(5000);
		
		List<WebElement> phones = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 11')]"));
		
		for(WebElement as:phones) {
			System.out.println(as.getText());
		}
		
		
		List<WebElement> rates = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		for(WebElement sa:rates) {
			
			System.out.println(sa.getText());
		}
		
		driver.quit();
		
		}
}

