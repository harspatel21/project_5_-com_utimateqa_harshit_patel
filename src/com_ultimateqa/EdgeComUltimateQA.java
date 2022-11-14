package com_ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeComUltimateQA {


    public static void main(String[] args) {
        //create baseUrl variable
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        //Setting up key and copy value from drivers file.
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        // Creating an object for EdgeDriver
        WebDriver driver = new EdgeDriver();
        //launching the url.
        driver.get(baseUrl);
        //Maximize window size
        driver.manage().window().maximize();
        //implicit time given to driver for 20 seconds.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Getting and printing a title of the page.
        String title = driver.getTitle();
        System.out.println("Page title is : " + title);

        //Printing current Url
        System.out.println("Current URL : " + driver.getCurrentUrl());

        //printing page source
        System.out.println("Page Source code : " + driver.getPageSource());

        //finding and email field element
        WebElement emailField = driver.findElement(By.name("user[email]"));
        // sending a data to email field element
        emailField.sendKeys("myultimatecourse@ultimate.com");

        // finding password field element
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        // Sending a data to password field element
        passwordField.sendKeys("MyUltimateCourse");

        //closing the window.
        driver.quit();
    }
}
