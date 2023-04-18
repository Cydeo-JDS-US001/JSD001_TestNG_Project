package com.cydeo.tests.day02_JavaFaker_Utilities;

import com.cydeo.utilities.PracticeCydeoUtility;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class JavaFakerPractice {

  WebDriver driver;
    @BeforeMethod
    public void setup() {
        //    Open Chrome browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //    Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/registration_form");
    }

    @AfterMethod
    public void tearDown() {
        //  driver.quit();

    }

    @Test
    public void fakerTest01(){

        Faker faker = new Faker();

        String fakeName= faker.name().firstName();
        String fakeLastname= faker.name().lastName();
        //String fakeUserName= faker.name().username();
        String fakeEmail= faker.internet().emailAddress();
        String fakePhoneNumber= faker.numerify("###-###-####");
        String fakeUserName= faker.bothify(fakeName+"###???");  // # for numbers
                                                                     //  ? for letters




//        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys(fakeName);
//        driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys(fakeLastname);
//        driver.findElement(By.xpath("//*[@name='phone']")).sendKeys(phoneNumber);
//        driver.findElement(By.xpath("//*[@name='email']")).sendKeys(fakeEmail);
//        driver.findElement(By.xpath("//*[@name='username']")).sendKeys(userName);

driver.findElement(By.xpath(PracticeCydeoUtility.locatorInputBox("firstname"))).sendKeys(fakeName);
driver.findElement(By.xpath(PracticeCydeoUtility.locatorInputBox("lastname"))).sendKeys(fakeLastname);
driver.findElement(By.xpath(PracticeCydeoUtility.locatorInputBox("phone"))).sendKeys(fakePhoneNumber);
driver.findElement(By.xpath(PracticeCydeoUtility.locatorInputBox("email"))).sendKeys(fakeEmail);
driver.findElement(By.xpath(PracticeCydeoUtility.locatorInputBox("username"))).sendKeys(fakeUserName);

    }

}
