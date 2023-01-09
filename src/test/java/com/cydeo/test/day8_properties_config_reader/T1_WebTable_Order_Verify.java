package com.cydeo.test.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTablesUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //1. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");
    }


    @Test
    public void order_name_verify_test(){

        //2. Verify Bob’s name is listed as expected.
        WebElement bobMartinCell = driver.findElement(By.xpath("//table[@class='" +
                "SampleTable']//" + "td[.='Bob Martin']"));

        //Expected: “Bob Martin”
        Assert.assertEquals(bobMartinCell.getText(), "Bob Martin");

        //3. Verify Bob Martin’s order date is as expected
        WebElement bobMartinOrderDate = driver.findElement(By.xpath("//table[@class=" +
                "'SampleTable']//td[.=" + "'Bob Martin']/following::td[3]"));

        //Expected: 12/31/2021
        Assert.assertEquals(bobMartinOrderDate.getText(), "12/31/2021");

    }

    //We now use utility method we created for the task above
    @Test
    public void test2(){

    String customerOrderDate1 = WebTablesUtils.returnOrderDate(driver, "Alexandra Gray");
        System.out.println("customerOrderDate1 = " + customerOrderDate1);

    }

    //Using WebTableUtils.orderVerify(); method
    @Test
    public void test3(){

                WebTablesUtils.orderVerify(driver, "Samuel Jackson",
                        "12/21/2021");

    }

}
