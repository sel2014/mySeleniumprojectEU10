package com.cydeo.test.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_getText_getAttribute {

    public static void main(String[] args) {


        //TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes ");

        WebElement loginBox = driver.findElement(By.cssSelector("input[class = 'login-inp']"));

        //3- Enter incorrect username into login box:

        loginBox.sendKeys("incorrect");
        //4- Click to `Reset password` button

        WebElement resetButton = driver.findElement(By.cssSelector("button[value= 'Reset password']"));
        resetButton.click();
        //5- Verify “error” label is as expected
        //Expected: Login or E-mail not found

        WebElement errorLabelButton = driver.findElement(By.cssSelector("div[class= 'errortext']"));

        String expectedErrorLabel = "Login or E-mail not found";
        String actualErrorLabel = errorLabelButton.getText();
        System.out.println("expectedErrorLabel = " + expectedErrorLabel);
        System.out.println("actualErrorLabel = " + actualErrorLabel);

        if (expectedErrorLabel.equals(actualErrorLabel)){
            System.out.println("Error label text verification PASSED!");
        }else {
            System.out.println("Error label text verification FAILED!!");
        }


        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from







    }
}
