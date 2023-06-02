package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Swathi");
   	    driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Senthilvel");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("swathi@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("swathi123");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,1000)", "");
        driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();

        
  //      WebDriverManager.chromedriver().setup();
//        WebDriver driver = new EdgeDriver();
//        driver.get("https://www.google.com");
        //System.out.println( "Hello World!" );
    	
    }
}
