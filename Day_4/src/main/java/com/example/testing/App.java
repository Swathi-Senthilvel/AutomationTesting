package com.example.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
        //System.out.println( "Hello World!" );
    }
}
