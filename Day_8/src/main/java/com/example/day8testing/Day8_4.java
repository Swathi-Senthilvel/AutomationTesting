package com.example.day8testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8_4 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		driver.manage().window().maximize();
		 
		//enter source location
		WebElement src=driver.findElement(By.id("source"));
		src.sendKeys("Coimbatore");
		WebElement dst=driver.findElement(By.id("destination"));
		//enter destination location
		dst.sendKeys("Chennai");
		WebElement datepick=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("argumets[0].setAttribute('value','03/06/2023')",datepick);
	}

}
