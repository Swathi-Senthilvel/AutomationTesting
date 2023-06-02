package com.example.day5testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task5 {
	public static void main(String [] args)
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.smart-hospital.in/site/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[5]/a")).click();
		String text = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div/div/div/div[1]/h3")).getText();
		System.out.println(text) ;
		String tag = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div/div/div/div[1]/h3")).getTagName();
		System.out.println(tag) ;
		WebElement button = driver.findElement(By.xpath("//*[@id=\"search-btn\"]")) ;
		Dimension size = button.getSize();
		int width = size.getWidth();
		int height = size.getHeight();
		System.out.println("width: "+width);
		
		System.out.println("height: "+height);
		
		System.out.println(button.getCssValue("color")) ;
		
		
	}

}