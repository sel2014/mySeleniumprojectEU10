package com.cydeo.myPracticePages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day4_Task3 {


    public Day4_Task3(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//button[@onclick='button1()']")
    public WebElement buttonOne;

    @FindBy(xpath = "//p[.= 'Clicked on button one!']")
    public WebElement clickedOnButtonOneMessage;

}