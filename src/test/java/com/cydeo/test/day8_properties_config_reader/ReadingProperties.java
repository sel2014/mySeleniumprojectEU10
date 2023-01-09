package com.cydeo.test.day8_properties_config_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_test() throws IOException {

        //1- Create the object of Properties
        Properties properties = new Properties();

        //2- We need to open the file in java memory: FileInputStream
        FileInputStream file = new FileInputStream("configuration.properties");

        //3- Load the properties object using FileInputStream object
        properties.load(file);

        //4- Use "properties" object to read value
        properties.getProperty("browser");

    }


}
