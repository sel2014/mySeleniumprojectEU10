package com.cydeo.test.day7_webtables_utilities_javafaker;

import com.cydeo.test.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class  T3_CRM_LOGIN extends TestBase {




    //TC #3: Login scenario
    @Test
    public void crm_login_test(){

        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

        //3. Enter valid username
        WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys("helpdesk1@cybertekschool.com");

        //USERNAME  PASSWORD
        //helpdesk1@cybertekschool.com  UserUser
        //Helpdesk2@cybertekschool.com  UserUser

        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));

        inputPassword.sendKeys("UserUser");

        //5. Click to `Log In` button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));

        loginButton.click();

        //6. Verify title is as expected:
        //Expected: Portal

        BrowserUtils.verifyTitle(driver, "My tasks");


    }

    @Test
    public void crm_login_test_2(){

        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");


        //Calling my utility method to log in helpdesk1
        CRM_Utilities.crm_login(driver);

        //6. Verify title is as expected:
        //Expected: Portal

        BrowserUtils.verifyTitle(driver, "My tasks");

    }

    @Test
    public void crm_login_test_3(){

        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");


        //Calling my utility method to log in helpdesk1
        CRM_Utilities.crm_login(driver, "helpdesk2@cybertekschool.com", "UserUser");

        //6. Verify title is as expected:
        //Expected: Portal

        BrowserUtils.verifyTitle(driver, "(1) Portal");

    }


}
