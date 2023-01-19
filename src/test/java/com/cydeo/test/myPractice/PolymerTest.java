package com.cydeo.test.myPractice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PolymerTest {

    @Test
    public void validatePolymer(){

        Driver.getDriver().get("http://todomvc.com/");

        WebElement javaScriptButton = Driver.getDriver().findElement(By.xpath("(//*[.='JavaScript'])[2]"));

        javaScriptButton.click();

        WebElement polymerLink = Driver.getDriver().findElement(By.xpath("//*[text()='Polymer']"));

        polymerLink.click();

        WebElement todoBox = Driver.getDriver().findElement(By.xpath("//input[@id='new-todo']"));

        BrowserUtils.sleep(2);
        todoBox.sendKeys("Complete Java day49"+Keys.ENTER);
        todoBox.sendKeys("Complete Selenium day10"+Keys.ENTER);

        //--------------------------------------------------------------------------------------------------------------


        WebElement toDoItemBox2 = Driver.getDriver().findElement(By.xpath("(//label[@class='style-scope td-item'])[2]"));

        Actions actions = new Actions(Driver.getDriver());

        BrowserUtils.sleep(2);
        actions.moveToElement(toDoItemBox2).doubleClick().perform();

        WebElement toDoItemBox2edit = Driver.getDriver().findElement(By.xpath("//input[@id='edit']"));

        toDoItemBox2edit.sendKeys(Keys.chord(Keys.CONTROL,"a"));


        BrowserUtils.sleep(2);
        toDoItemBox2edit.sendKeys(Keys.DELETE);
        toDoItemBox2edit.sendKeys("Complete Selenium day9 and day10");







        //secondToDoItemBox.sendKeys("Complete Selenium day9");

        //WebElement secondToDoBoxCheckBox = Driver.getDriver().findElement(By.xpath("(//input[@class='toggle style-scope td-item'])[2]"));

        //secondToDoBoxCheckBox.click();
    }




}

/*
Write a basic browser automation framework to validate a Polymer website. The focus should
be on The Web Application under test http://todomvc.com/
1. The first step should be to load the website, click within the JavaScript tab, and select
Polymer link.
2. The second step should be: Add two Todo items
3. Bonus: (optional stretch goal): Edit the content of the second Todo item
 */
