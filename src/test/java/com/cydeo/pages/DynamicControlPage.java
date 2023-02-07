package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlPage {

    public DynamicControlPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@onclick='swapCheckbox()']" )
    public WebElement removeButton;

    @FindBy(xpath = "//div[@id='loading']")
    public WebElement loadingBar;

    @FindBy(xpath = "//input[type ='checkbox']")
    public WebElement checkBox;

    @FindBy(xpath = "//p[@id ='message']")
    public WebElement itIsGoneMessage;
}
