package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    	WebDriverManager.edgedriver().setup();
    	WebDriver driver= new EdgeDriver();
    	//launching the url
    	    	driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
    	//maximizing the webpage
    	driver.manage().window().maximize();
  //      System.out.println( "Hello World!" );
    	driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Devisri");
    	driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Y");
    	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("devisrichitra2004@gmail.com");
    	driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("devisri@2004");
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
     	js.executeScript("window.scrollBy(0,5000)", "");
        driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
        Thread.sleep(1000);
    	
    }
}
