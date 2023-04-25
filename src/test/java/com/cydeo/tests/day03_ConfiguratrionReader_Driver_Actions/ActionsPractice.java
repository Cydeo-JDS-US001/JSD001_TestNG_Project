package com.cydeo.tests.day03_ConfiguratrionReader_Driver_Actions;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ActionsPractice {
    WebDriver driver;
    Actions actions;
    @BeforeMethod
    public void setUp(){

        driver=Driver.get();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(ConfigurationReader.get("url1"));
        actions=new Actions(driver);

    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }


    @Test
    public void test1() throws InterruptedException {
        //TC #3: Hover Test
        //1. Go to https://practice.cydeo.com/hovers

        WebElement image1=driver.findElement(By.xpath("(//img)[1]"));
        WebElement image2=driver.findElement(By.xpath("(//img)[2]"));
        WebElement image3=driver.findElement(By.xpath("(//img)[3]"));

        WebElement user1=driver.findElement(By.xpath("//h5[contains(text(),'user1')]"));
        WebElement user2=driver.findElement(By.xpath("//h5[contains(text(),'user2')]"));
        WebElement user3=driver.findElement(By.xpath("//h5[contains(text(),'user3')]"));

        //2. Hover over to first image
        actions.moveToElement(image1).perform();

        Thread.sleep(2000);
        //3. Assert:
        //a. “name: user1” is displayed
        Assert.assertTrue(user1.isDisplayed(),"User1 is not displayed");
        //4. Hover over to second image
        actions.moveToElement(image2).perform();
        Thread.sleep(2000);
        //5. Assert:
        //a. “name: user2” is displayed
        Assert.assertTrue(user2.isDisplayed(),"user2 is not displayed");
        //6. Hover over to third image
        actions.moveToElement(image3).perform();
        Thread.sleep(2000);
        //7. Confirm:
        //a. “name: user3” is displayed
        Assert.assertTrue(user3.isDisplayed(),"user3 is not displayed");



    }



}
