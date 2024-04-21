package com.cybertek.day12_waits_practice;

import com.cybertek.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SleepAndImplicitWaitExample {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();






    }
    @AfterMethod
    public void tearDown() throws InterruptedException{


       // Thread.sleep(5000);
     //  Driver.closeDriver();
    }


    @Test
    public void testSleep() throws InterruptedException {


      //  System.out.println("Hello World ");
        // Thread.sleep(2000);
     //   System.out.println("Learning Selenium");


        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");



        driver.findElement(By.tagName("button")).click();


      Thread.sleep(10000);

        System.out.println(driver.findElement(By.id("finish")).getText());

    }
    @Test
    public void implicitWait() {


        // please wait when you are trying to find and element but cannot find it
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
        driver.findElement(By.tagName("button")).click();




        System.out.println(driver.findElement(By.id("finish")).getText());







    }@Test
    public void implicitWait2 (){

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.cssSelector("#checkbox-example > button")).click();
        System.out.println(driver.findElement(By.id("message")).getText());
        driver.findElement(By.cssSelector("#checkbox-example > button")).click();
        driver.findElement(By.id("message")).isDisplayed();



    }






}
