package com.cydeo.test.day11_actions_jsexecuter_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_Circle_Drag_N_Drop {


    @Test

    public void drag_drop_Test(){

        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index ");

        WebElement acceptAndCloseCookiesButton = Driver.getDriver().findElement(By.xpath("//button[@id=" +
                "'onetrust-accept-btn-handler']"));
        acceptAndCloseCookiesButton.click();
        //---------------------------------------------

        WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));
        WebElement smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));





    }


}



/*
TC #: Drag and drop
1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
2. Drag and drop the small circle to bigger circle.
3. Assert:
-Text in big circle changed to: “You did great!”
 */
