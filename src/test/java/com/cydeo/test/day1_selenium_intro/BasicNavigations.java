package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1.Setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2. Create instance of the Selenium WebbDriver
        // This is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        //will maximize window size
        driver.manage().window().maximize();

        //3- Go to "http://www.tesla.com"
        driver.get("http://www.tesla.com");

        //get the title of the page
        // System.out.println("driver.getTitle() = " + driver.getTitle());

        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);


        //get current URL using Selenium
        String currentURL =  driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back

        driver.navigate().back();

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate forward
        driver.navigate().forward();

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate refresh

        driver.navigate().refresh();

        Thread.sleep(3000);

        //use navigate().to():
        driver.navigate().to("https://www.google.com");

        //get the current title after getting google page
        currentTitle = driver.getTitle();

        System.out.println("currentTitle = " + currentTitle);

        //get current URL using Selenium
         currentURL =  driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);

        //this will close the currently opened window
        driver.close();

        //this will close all of the opened windows
        driver.quit();




    }
}
