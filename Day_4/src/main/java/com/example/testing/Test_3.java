package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_3 {
	
	public static void main(String [] args)
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		String url = "https://demo.opencart.com/" ;
		driver.navigate().to(url);
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("search"));
		search.sendKeys("mobiles");
		driver.quit();
	}

	

}