package com.cydeo.test.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_ScrollDown {

    @Test
    public void scroll_down_up(){

        Driver.getDriver().get("https://practice.cydeo.com/ ");

        Actions actions = new Actions(Driver.getDriver());

        BrowserUtils.sleep(2);
        WebElement poweredByCydeoLink = Driver.getDriver().findElement(By.xpath(
                "//*[@id=\"page-footer\"]/div/div"));

        actions.moveToElement(poweredByCydeoLink).perform();





    }


}



/*
TC #4: Scroll practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/
3- Scroll down to “Powered by CYDEO”
4- Scroll using Actions class “moveTo(element)” method


TC #5: Scroll practice 2
1- Continue from where the Task 4 is left in the same test.
2- Scroll back up to “Home” link using PageUP button
 */
