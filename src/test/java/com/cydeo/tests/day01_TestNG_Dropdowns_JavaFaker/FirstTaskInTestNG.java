package com.cydeo.tests.day01_TestNG_Dropdowns_JavaFaker;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTaskInTestNG {
    @BeforeMethod
    public void setup(){


    }
    @AfterMethod
    public void tearDown(){

    }

    @Test
    public void  cydeoTitleVerification(){
        //First Task in Test NG
//TC #4: Cydeo Title Verification
//1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
//2.Go to https://www.cydeo.com/
        driver.get("https://www.cydeo.com/");
//3.Verify title:
        System.out.println(driver.getTitle());
        String actualResult=driver.getTitle();
//Expected: Cydeo
        String expectedResult="Cydeo";

        Assert.assertEquals(actualResult,expectedResult);

        driver.quit();

    }






}
