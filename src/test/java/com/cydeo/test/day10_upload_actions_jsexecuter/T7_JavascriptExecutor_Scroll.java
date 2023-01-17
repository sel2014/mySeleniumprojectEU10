package com.cydeo.test.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_JavascriptExecutor_Scroll {

    @Test
    public void javascript_executor_scroll(){

        Driver.getDriver().get("https://practice.cydeo.com/large");

        WebElement cydeoLink = Driver.getDriver().findElement(By.xpath("//*[text()='CYDEO']"));
        WebElement homeLink = Driver.getDriver().findElement(By.xpath("//*[text()='Home']"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink);


        BrowserUtils.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)", homeLink);


    }


}

/*

TC #7: Scroll using JavascriptExecutor
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/large
3- Scroll down to “Cydeo” link
4- Scroll up to “Home” link
5- Use below provided JS method only

JavaScript method to use : arguments[0].scrollIntoView(true)

Note: You need to locate the links as web elements and pass them as
arguments into executeScript() method
 */
