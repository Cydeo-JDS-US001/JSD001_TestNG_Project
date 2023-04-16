package com.cydeo.tests.day01_TestNG_Dropdowns_JavaFaker;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DropDownPractice {
    /*

    TC #6: Selecting date on dropdown and verifying
    Open Chrome browser
    Go to https://practice.cydeo.com/dropdown
    Select “December 1st, 1933” and verify it is selected.
    Select year using : visible text
    Select month using : value attribute
    Select day using : index number

    TC #7: Selecting state from State dropdown and verifying result
    Open Chrome browser
    Go to http://practice.cybertekschool.com/dropdown
    Select Illinois
    Select Virginia
    Select California
    Verify final selected option is California.
    Use all Select options. (visible text, value, index)

    TC #8: Selecting value from non-select dropdown
    Open Chrome browser
    Go to https://practice.cydeo.com/dropdown
    Click to non-select dropdown
    Select Facebook from dropdown
    Verify title is “Facebook - Log In or Sign Up”  */

    WebDriver driver;
    @BeforeMethod
    public void setup() {
        //    Open Chrome browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //    Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();

    }


    @Test
    public void dropDownTest1() throws InterruptedException {
        //TC #6: Selecting date on dropdown and verifying

        //    Select “December 17th, 1933” and verify it is selected.
        //    Select year using : visible text
        Select dropDownYear=new Select(driver.findElement(By.xpath("//select[@id='year']")));
        dropDownYear.selectByVisibleText("1933");
        Thread.sleep(2000);

        //    Select month using : value attribute
        Select dropDownMonth=new Select(driver.findElement(By.xpath("//select[@id='month']")));
        dropDownMonth.selectByValue("11");
        Thread.sleep(2000);

        //    Select day using : index number
        Select dropDownDay=new Select(driver.findElement(By.xpath("//select[@id='day']")));
        dropDownDay.selectByIndex(16);
        Thread.sleep(2000);

        Assert.assertTrue(dropDownYear.getFirstSelectedOption().getText().equals("1933"),"The selected year is not 1935 so test failed");
       Assert.assertEquals(dropDownMonth.getFirstSelectedOption().getText(),"December","Selected month was not December so test failed");
        Assert.assertEquals(dropDownDay.getFirstSelectedOption().getText(),"17");

    }

    @Test
    public void selectingState(){
        //TC #7: Selecting state from State dropdown and verifying result
        //Open Chrome browser  DONE in before method
        //Go to http://practice.cybertekschool.com/dropdown  DONE in before method

        //Select Illinois
        //Select Virginia
        //Select California
        //Verify final selected option is California.
        //Use all Select options. (visible text, value, index)

    }















}
