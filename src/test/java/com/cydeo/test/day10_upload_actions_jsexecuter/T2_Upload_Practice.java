package com.cydeo.test.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {

    @Test
    public void upload_test(){

        Driver.getDriver().get("https://practice.cydeo.com/upload");

        String path = "C:\\Users\\sel20\\OneDrive\\Desktop\\HTML Class\\cybertruck.jpeg";

        WebElement fileUpload = Driver.getDriver().findElement(By.xpath(
                "//input[@id='file-upload']"));

        BrowserUtils.sleep(2);
        fileUpload.sendKeys(path);

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();

        WebElement fileUploadMessage = Driver.getDriver().findElement(By.tagName("h3"));

        Assert.assertTrue(fileUploadMessage.isDisplayed());


    }


}



/*
TC #2 Upload Test
1. Go to https://practice.cydeo.com/upload
2. Find some small file from your computer, and get the path of it.
3. Upload the file.
4. Assert:
-File uploaded text is displayed on the page
 */
