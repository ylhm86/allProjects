package com.cybertek.day12_waits_practice;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExplicitWait {

    @Test
    public void explicitWait() throws InterruptedException{






        Driver.getDriver().get("http://the-internet.herokuapp.com/dynamic_controls");
        Driver.getDriver().findElement(By.cssSelector("#input-example > button")).click();

        Driver.getDriver().findElement(By.cssSelector("#input-example > input[type=text]")).sendKeys("Hello World!");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#input-example > input[type=text]")));




    }@Test
    public void test(){

        Driver.getDriver().get("http://the-internet.herokuapp.com/dynamic_loading/2");


        Driver.getDriver().findElement(By.cssSelector("button")).click();

       WebElement text = Driver.getDriver().findElement(By.cssSelector("#finish"));

        WebDriverWait waits = new WebDriverWait(Driver.getDriver(),10);


        waits.until(ExpectedConditions.visibilityOf(text));

        System.out.println(text.getText());
        Assert.assertTrue(text.isDisplayed());

    }



}
