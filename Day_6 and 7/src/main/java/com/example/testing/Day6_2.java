package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6_2 {
	public static void main(String [] args)
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver() ;
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Swathi");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("TS");
		driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("swa@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"radio_1665627729_Female\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"date_box_1665628538_field\"]/span/input[1]")).sendKeys("22/01/2003");
		driver.findElement(By.xpath("//*[@id=\"input_box_1665629217\"]")).sendKeys("Indian") ;
		driver.findElement(By.xpath("//*[@id=\"phone_1665627880\"]")).sendKeys("66984656");
		driver.findElement(By.xpath("//*[@id=\"country_1665629257\"]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("window.scrollBy(0,1000)", "");
		driver.findElement(By.xpath("//*[@id=\"phone_1665627865\"]")).sendKeys("9876543");
		driver.findElement(By.xpath("//*[@id=\"date_box_1665629845_field\"]/span/input[1]")).sendKeys("12.07.23");
		driver.findElement(By.xpath("//*[@id=\"number_box_1665629930\"]")).sendKeys("4");
		driver.findElement(By.xpath("//*[@id=\"input_box_1665630010\"]")).sendKeys("402,2");
		driver.findElement(By.xpath("//*[@id=\"textarea_1665630078\"]")).sendKeys("Manager") ;
		driver.findElement(By.xpath("//*[@id=\"radio_1665627931_Yes\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"radio_1665627997_Single Room\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"radio_1665628131_Vegetarian\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"select_1665628361\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"privacy_policy_1665633140\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-771\"]/form/div[4]/button")).click();
	}

}
