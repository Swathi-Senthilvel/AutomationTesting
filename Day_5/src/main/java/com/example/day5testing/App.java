package com.example.day5testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		String mac="MacBook";
		
       //
		driver.get("https://demo.opencart.com/index.php?route=product/product&language=en-gb&product_id=43");
//		sleep
		WebElement mactext=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/h1"));
		String text=mactext.getText();
		System.out.println(text);
		if(mac.equals(text)) {
			System.out.println("The product is macbook");
		}
		else {
			System.out.println("Not a exact product");
			
		}
		System.out.println(mactext.getTagName());
//		System.out.println(driver.getCssValue(mactext));
	    System.out.println( mactext.getCssValue("color"));
	    System.out.println( mactext.getCssValue("width"));
	    System.out.println( mactext.getCssValue("height"));
		Thread.sleep(5000);
		Thread.sleep(5000);
		driver.quit();
	}

}
