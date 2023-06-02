package com.example.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6_1 {
	public static void main(String [] args)
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES) ;
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Swathi");
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("TS") ;
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("swa@gmail.com") ;
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("password") ;
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("window.scrollBy(0,1000)", "") ;
		driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click() ;
		
	}

}