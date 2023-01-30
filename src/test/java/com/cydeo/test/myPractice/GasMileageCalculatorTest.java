package com.cydeo.test.myPractice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GasMileageCalculatorTest {


    @Test
    public void gasMileageCalculator(){

        Driver.getDriver().get("https://www.calculator.net ");
        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@id=" +
                "'calcSearchTerm']"));

        searchBox.sendKeys("gas mileage");
        //---------------------------------------------------------------------

        WebElement gasMileageCalculatorLink = Driver.getDriver().findElement(By.xpath("//a[.=" +
                "'Gas Mileage Calculator']"));

        gasMileageCalculatorLink.click();

        Assert.assertEquals(Driver.getDriver().getTitle(), "Gas Mileage Calculator");

        //--------------------------------------------------------------------
        WebElement gasMileageCalculatorLabel = Driver.getDriver().findElement(By.xpath("//h1"));

        System.out.println("gasMileageCalculatorLabel.isDisplayed() = " + gasMileageCalculatorLabel.isDisplayed());
        //---------------------------------------------------------------------
        WebElement clearButton = Driver.getDriver().findElement(By.xpath("(//img[@class=" +
                "'clearbtn'])[2]"));
        clearButton.click();
        //---------------------------------------------------------------------
        WebElement currentOdometerReading = Driver.getDriver().findElement(By.xpath("//input[@id=" +
                "'mucodreading']"));
        currentOdometerReading.sendKeys("7925");
        //---------------------------------------------------------------------
        WebElement previousOdometerReading = Driver.getDriver().findElement(By.xpath("//input[@id=" +
                "'mupodreading']"));
        previousOdometerReading.sendKeys("7550");
        //---------------------------------------------------------------------
        WebElement gasAddedToTankReading = Driver.getDriver().findElement(By.xpath("//input[@id=" +
                "'mugasputin']"));
        gasAddedToTankReading.sendKeys("16");
        //---------------------------------------------------------------------

        WebElement gasPriceField = Driver.getDriver().findElement(By.xpath("//input[@id='mugasprice']"));
        gasPriceField.sendKeys("3.55");
        //---------------------------------------------------------------------
        WebElement calculateButton = Driver.getDriver().findElement(By.xpath("(//input[@value=" +
                "'Calculate'])[2]"));
        calculateButton.click();
        //---------------------------------------------------------------------
        WebElement mpgResultButton = Driver.getDriver().findElement(By.xpath("//span[@class='bigtext']"));

        Assert.assertEquals(mpgResultButton.getText(), "(55.13 mpg)");
        //---------------------------------------------------------------------




    }



}



/*
Task #: Gas Mileage Calculator Automation Test

1. Add a new class GasMileageCalculatorTest
2. Go to https://www.calculator.net
3. Search for “gas mileage” using search box
4. Click on the “Gas Mileage Calculator” link


5. On Next page verify:
a. Title equals: “Gas Mileage Calculator”
b. “Gas Mileage Calculator” label is displayed


6. Locate, clear and type “7925” into “Current odometer” field
7. Locate, clear and type “7550” into “Previous odometer” field
8. Locate, clear and type “16” into “Gas added” field
9. Locate, clear and type “3.55” into “Gas price” field
10. Click on Calculate button
11. Verify mpg value is as expected:
Expected value: “55.13 mpg”
 */
