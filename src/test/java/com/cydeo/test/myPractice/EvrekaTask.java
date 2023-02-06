package com.cydeo.test.myPractice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EvrekaTask {

    @Test
    public void evreka_task() {

        Driver.getDriver().get("https://www.amazon.com.tr");

        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@id=" +
                "'twotabsearchtextbox']"));

        BrowserUtils.sleep(2);

        searchBox.click();

        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.xpath("//input[@id=" +
                "'sp-cc-accept']"));

        BrowserUtils.sleep(2);

        acceptCookiesButton.click();

        searchBox.sendKeys("iPhone13 512" + Keys.ENTER);

        WebElement resultText = Driver.getDriver().findElement(By.xpath("//div[@class=" +
                "'a-section a-spacing-small a-spacing-top-small']"));

        System.out.println(resultText.getText());

        WebElement iPhone13Button = Driver.getDriver().findElement(By.xpath("(//span[@class=" +
                "'a-size-base-plus a-color-base a-text-normal'])[1]"));

        BrowserUtils.sleep(2);
        iPhone13Button.click();


        WebElement productTitle = Driver.getDriver().findElement(By.xpath("//span[@id='productTitle']"));

        WebElement colourBox = Driver.getDriver().findElement(By.xpath("//img[@alt = 'Yıldız Işığı']"));

        colourBox.click();

        WebElement colour = Driver.getDriver().findElement(By.xpath("//*[.='Yıldız Işığı']"));

        WebElement size = Driver.getDriver().findElement(By.xpath("//p[.='512 GB']"));

        WebElement priceWhole = Driver.getDriver().findElement(By.xpath("//span[@class='a-price-whole']"));

        WebElement priceFraction = Driver.getDriver().findElement(By.xpath("//span[@class='a-price-fraction']"));

        WebElement priceSymbol = Driver.getDriver().findElement(By.xpath("//span[@class='a-price-symbol']"));

        WebElement stockBox = Driver.getDriver().findElement(By.xpath("//span[@class='a-size-medium a-color-success']"));


        String totalPrice = priceWhole.getText() + "," + priceFraction.getText() + priceSymbol.getText();

//        List<WebElement> list = new ArrayList<>();
//
//        list.add(productTitle);
//        list.add(colour);
//        list.add(stockBox);
//
//        for (WebElement eachElement : list) {
//
//            System.out.println(eachElement.getText());
//        }
//        System.out.println(totalPrice);

        //System.out.println(resultText.getText());
        System.out.println(productTitle.getText()+"       "+"Size:"+size.getText());
        System.out.println("Colour:"+colour.getText()+"        "+"Price:"+totalPrice);
        System.out.println(stockBox.getText());


    }


}

/*
add webb element to list
 */
