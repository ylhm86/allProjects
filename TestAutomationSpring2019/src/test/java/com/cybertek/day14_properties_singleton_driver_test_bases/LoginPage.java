package com.cybertek.day14_properties_singleton_driver_test_bases;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;

public class LoginPage {
    String userNameLocator = "prependedInput";
    String passwordLocator = "prependedInput2";
    String loginButtonLocator = "_submit";

    public void login(String userName, String password) {
        Driver.getDriver().findElement(By.id(userNameLocator)).sendKeys(userName);
        Driver.getDriver().findElement(By.id(passwordLocator)).sendKeys(password);
        Driver.getDriver().findElement(By.id(loginButtonLocator)).click();
    }
}
