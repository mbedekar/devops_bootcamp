package com.selenium.test_facebook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;

public class TestFb {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.getTitle();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

        WebElement userName = driver.findElement(By.name("email"));
        WebElement passwd = driver.findElement(By.name("pass"));
        WebElement logButton = driver.findElement(By.name("login"));
        
        userName.sendKeys("mandar_bedekar2007@outlook.com");
        passwd.sendKeys("241369AK!");
        logButton.click();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

        WebElement message = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div[1]/span"));
        
        System.out.println(message.getText());
        
        

        //File src = message.getScreenshotAs(OutputType.FILE);
        //File dest = new File("C:\\Data\\VisibleOfElementScreenShotAs.png");
        //FileHandler.copy(src, dest);
        
        //driver.close();

	}

}
