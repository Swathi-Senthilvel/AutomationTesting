package com.example.day5testing;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 {
	public static void main(String [] args)
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver =  new EdgeDriver();
		
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		String actualUrl = "https://j2store.net/free/" ;
		String expectedUrl = driver.getCurrentUrl();
		if(actualUrl.equals(expectedUrl))
		{
			System.out.println("Url is valid");
		}
		else
		{
			System.out.println("Url is invalid") ;
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("window.scrollBy(0,1000)", "") ;
		
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
		String aUrl="https://j2store.net/free/index.php/shop?filter_catid=11";
		String eUrl= driver.getCurrentUrl();
		if(aUrl.equals(eUrl))
		{
			System.out.println("Url is valid");
		}
		else
		{
			System.out.println("Url is invalid") ;
		}
		driver.quit();
		
	}

}