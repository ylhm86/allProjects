package com.cybertek.day7;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomeWork {

//    Homework:
//
//    Practice:
//    Task #1
//    deselectAll();
//    deselectByIndex();
//    deselectByValue();
//    deselectByVisibleText();
//    isMultiple();
//
//    Task #2
//    Also, write a method that will check that values in dropdown are stored in the alphabetic order
//
//    Task #3
//    Try to automate non-select dropdown. (Select a website)

    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {

        SeleniumUtils.waitPlease(2);
        deselectAll();
        SeleniumUtils.waitPlease(2);
        driver.close();
    }

    public static void deselectAll(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement element = driver.findElement(By.xpath("//h3[text()='Dropdown List']"));
        SeleniumUtils.verifyIsDisplayed(element);
    }


    public static void ByIndex() {
        WebElement dropdown1 = driver.findElement(By.id("dropdown"));

        Select dropdownSelect = new Select(dropdown1);

        String actual = dropdownSelect.getFirstSelectedOption().getText();
        String expected = "Please select an option";
        SeleniumUtils.verifyEquals(expected, actual);

        List<WebElement> options = dropdownSelect.getOptions();
        for(WebElement option: options){
            System.out.println(option.getText());
        }
    }



}
