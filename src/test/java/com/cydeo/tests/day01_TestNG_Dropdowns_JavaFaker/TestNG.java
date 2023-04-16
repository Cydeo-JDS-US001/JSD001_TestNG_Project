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
        WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();

    }

    @Test
    public void test1(){

    }






}
