package com.example.day5testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicit {
		public static void main(String [] args)
		{
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver() ;
			driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
			driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Sandhya") ;
			driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("A") ;
			driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("sak@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("password") ;
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			JavascriptExecutor js = (JavascriptExecutor) driver ;
			js.executeScript("window.scrollBy(0,1000)", "");
			driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
			js.executeScript("window.scrollBy(0,1000)", "");
			js.executeScript("window.scrollBy(0,1000)", "");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
			driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
			driver.quit();
			
		}
}