package com.cydeo.test.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class T3_Actions_Hover {

    @Test
    public void hovering_test(){

        Driver.getDriver().get("https://practice.cydeo.com/hovers");


    }



}

/*
TC #3: Hover Test
1. Go to https://practice.cydeo.com/hovers
2. Hover over to first image
3. Assert:
a. “name: user1” is displayed
b. “view profile” is displayed
4. Hover over to second image
5. Assert:
a. “name: user2” is displayed
b. “view profile” is displayed
6. Hover over to third image
7. Confirm:
a. “name: user3” is displayed
b. “view profile” is displayed
 */
