package com.cydeo.test.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {

    public static void main(String[] args) {

        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes ");

        //3- Verify “Reset password” button text is as expected:
        //                                                          tagName[attribute = 'value']
       // WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value = " +
          //      "'Reset password']"));
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));;

        //Expected: Reset password

        String expectedResetButtonText = "Reset password";
        String actualResetButtonText = resetPasswordButton.getText();

        if (actualResetButtonText.equals(expectedResetButtonText)) {
            System.out.println("Log In button text verification passed!");

        } else {
            System.out.println("Log In button text verification failed!");
        }

        System.out.println("expectedResetButtonText = " + expectedResetButtonText);
        System.out.println("actualResetButtonText = " + actualResetButtonText);

        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from




    }
}
