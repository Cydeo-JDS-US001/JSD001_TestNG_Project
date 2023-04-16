package com.cydeo.tests.day01_TestNG_Dropdowns_JavaFaker;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        System.out.println("I am running before every test");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("I m running after every test");

    }

    @Test
    public void test1(){
        System.out.println("run test1");
    }

    @Test
    public void test2(){
        System.out.println("run test2");
    }

    @Test
    public void test3(){
        System.out.println("run test3");
    }






}
