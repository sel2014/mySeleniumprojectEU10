package com.cydeo.test.myPractice;

import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmartBearPractice2 {


    @Test
    public void orderPlacing() {

        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/" +
                "testcomplete12/WebOrders/login.aspx ");

        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx ");
        WebElement usernameButton = Driver.getDriver().findElement(By.xpath("//input[@id=" +
                "'ctl00_MainContent_username']"));
        WebElement passwordButton = Driver.getDriver().findElement(By.xpath("//input[@id=" +
                "'ctl00_MainContent_password']"));
        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//input[@id=" +
                "'ctl00_MainContent_login_button']"));

        usernameButton.sendKeys("Tester");
        passwordButton.sendKeys("test");

        loginButton.click();

        //------------------------------------------------------

        WebElement orderButton = Driver.getDriver().findElement(By.xpath("//a[.='Order']"));
        orderButton.click();

        Select productSelect = new Select(Driver.getDriver().findElement(By.xpath("//select")));

        productSelect.selectByVisibleText("FamilyAlbum");

        WebElement quantityButton = Driver.getDriver().findElement(By.xpath("//input[@id=" +
                "'ctl00_MainContent_fmwOrder_txtQuantity']"));

        quantityButton.sendKeys("2");

        WebElement calculateButton = Driver.getDriver().findElement(By.xpath("//input[@value=" +
                "'Calculate']"));
        calculateButton.click();

        //------------------------------------------------------

        WebElement nameButton = Driver.getDriver().findElement(By.xpath("//input[@id=" +
                "'ctl00_MainContent_fmwOrder_txtName']"));
        WebElement streetButton = Driver.getDriver().findElement(By.xpath("//input[@id=" +
                "'ctl00_MainContent_fmwOrder_TextBox2']"));
        WebElement cityButton = Driver.getDriver().findElement(By.xpath("//input[@id=" +
                "'ctl00_MainContent_fmwOrder_TextBox3']"));
        WebElement stateButton = Driver.getDriver().findElement(By.xpath("//input[@id=" +
                "'ctl00_MainContent_fmwOrder_TextBox4']"));
        WebElement zipButton = Driver.getDriver().findElement(By.xpath("//input[@id=" +
                "'ctl00_MainContent_fmwOrder_TextBox5']"));

        //------------------------------------------------------

        Faker faker = new Faker();
        String name = faker.name().fullName();
        String street = faker.address().streetName();
        String city = faker.address().city();
        String state = faker.address().state();
        String zip = faker.numerify("########");
        String cardNumber = faker.finance().creditCard().replaceAll("-","");
        String expiryDate = faker.numerify("08/10");


        //------------------------------------------------------

        nameButton.sendKeys(name);
        streetButton.sendKeys(street);
        cityButton.sendKeys(city);
        stateButton.sendKeys(state);
        zipButton.sendKeys(zip);


        //------------------------------------------------------

        WebElement visaButton = Driver.getDriver().findElement(By.xpath("//label[.='Visa']"));
        visaButton.click();
        WebElement cardNumberButton = Driver.getDriver().findElement(By.xpath("//input[@id=" +
                "'ctl00_MainContent_fmwOrder_TextBox6']"));

        WebElement expiryDateButton = Driver.getDriver().findElement(By.xpath("//input[@id=" +
                "'ctl00_MainContent_fmwOrder_TextBox1']"));

        //--------------------------------------------------------

        cardNumberButton.sendKeys(cardNumber);
        expiryDateButton.sendKeys((CharSequence) expiryDate);

        //--------------------------------------------------------

        WebElement processButton = Driver.getDriver().findElement(By.xpath("//a[@id=" +
                "'ctl00_MainContent_fmwOrder_InsertButton']"));

        processButton.click();

        WebElement message = Driver.getDriver().findElement(By.xpath("//*[@id=" +
                "'ctl00_MainContent_fmwOrder']/tbody/tr/td/div/strong"));

        Assert.assertEquals(message.getText(), "New order has been successfully added.");


    }


}




/*
TC#2: Smartbear software order placing
1. Open browser
2. Go to website:
http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
3. Enter username: “Tester”
4. Enter password: “test”
5. Click on Login button
6. Click on Order
7. Select familyAlbum from product, set quantity to 2
8. Click to “Calculate” button
9. Fill address Info with JavaFaker
• Generate: name, street, city, state, zip code
10. Click on “visa” radio button
11. Generate card number using JavaFaker
12. Click on “Process”
13. Verify success message “New order has been successfully added.”
 */
