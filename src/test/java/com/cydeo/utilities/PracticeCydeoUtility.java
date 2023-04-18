package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeCydeoUtility {
    WebDriver driver;

    public static String locatorInputBox (String name){

         return "//*[@name='"+name+"']";

    }




}
