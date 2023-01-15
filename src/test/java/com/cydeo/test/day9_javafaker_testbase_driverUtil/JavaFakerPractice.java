package com.cydeo.test.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1(){
        //Creating Faker object to reach methods
        Faker faker = new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));

        System.out.println("faker.numerify(\"312-###-157-###\") = " + faker.numerify("312-###-157-###"));

        System.out.println("faker.letterify(\"???-????\") = " + faker.letterify("???-????"));// random letters

        System.out.println("faker.bothify(\"##??-???###\") = " + faker.bothify("##??-???###"));

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard().
                replaceAll("-",""));

        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());


    }
}
