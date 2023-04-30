package com.cydeo.tests.day04_Actions;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractice2 extends TestBase {

   //TC #4: Scroll practice
        //1- Open a chrome browser   ---it is done by @BeforeTest in TestNG
        //2- Go to: https://practice.cydeo.com/  -- this address is saved in conf.properties we call it in @Beforetest
        //3- Scroll down to “Powered by CYDEO”
        //4- Scroll using Actions class “moveTo(element)” method

    @Test
    public void scrollTest(){
        WebElement cydeoLink=driver.findElement(By.xpath("//a[text()='CYDEO']"));
      // actions.scrollToElement(cydeoLink).perform();  -- this is working
      actions.moveToElement(cydeoLink).perform();     // this also works

    }


    @Test
    public void dragAndDrop(){
        // open chrome-- done
        // go to https://practice.cydeo.com/drag_and_drop_circles
        driver.get(ConfigurationReader.get("url3"));
        WebElement smallCircle=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement bigCircle=driver.findElement(By.xpath("//div[@id='droptarget']"));
        // drag and drop the small circle into big circle
        actions.dragAndDrop(smallCircle,bigCircle).perform();
        // verify that "You did great!" is displayed after draganddrop
        WebElement youDidIt=driver.findElement(By.xpath("//div[text()='You did great!']"));
        Assert.assertTrue(youDidIt.isDisplayed(),"you did it element is not displayed, you made something wrong buddy!!");






    }


}
