package com.example.day5testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {
	public static void main(String [] args)
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver() ;
		
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		String expectedTitle = "Home" ;
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Validated") ;
		}
		else
		{
			System.out.println("Not Validated") ;
		}
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("window.scrollBy(0,1000)", "") ;
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
		String eTitle = "Shop" ;
		String aTitle = driver.getTitle();
		if(aTitle.equals(eTitle))
		{
			System.out.println("Validated") ;
		}
		else
		{
			System.out.println("Not Validated") ;
		}
		driver.quit() ;
	}
}