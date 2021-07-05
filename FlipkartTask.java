package org.sample1;

import java.util.ArrayList;
import java.util.Collections;
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
		
		List<String> high =new ArrayList<String>();
		
		for(WebElement as:phones) {
			high.add(as.getText());
		}
		
		List<String>sorted= new ArrayList<String>(high);
		
		Collections.sort(sorted);
		
		System.out.println("Model ShortList");
		
		for(String sr:sorted) {
			
			System.out.println(sr);
		}
		
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		List<String>prices = new ArrayList<String>();
		
		for(WebElement sa:price) {
			prices.add(sa.getText());
		}
		
		List<String>sortedprices = new ArrayList<String>(prices);
		
		Collections.sort(sortedprices);
		
		System.out.println("Prices ShortListed");
		
		for(String pr:sortedprices) {
			
		System.out.println(pr);
		
		}
		driver.quit();
		
		}
}

