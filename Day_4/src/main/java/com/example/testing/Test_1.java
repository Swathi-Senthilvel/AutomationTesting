package com.example.testing;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_1
{
    public static void main( String[] args ) throws InterruptedException 
    {	
    	WebDriverManager.edgedriver().setup();
    	WebDriver driver = new EdgeDriver();
    	//open the url
    	driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
    	//maximize the screen
    	driver.manage().window().maximize();
    	driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Swathi");
    	driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Senthilvel") ;
    	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("swathi@gmail.com");
    	driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("swathi123");
    	JavascriptExecutor js = (JavascriptExecutor) driver ;
    	Thread.sleep(5000) ;
    	js.executeScript("window.scrollBy(0,1000)", "") ;
    	driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();	
    
    }
}