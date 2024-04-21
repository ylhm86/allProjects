package com.cybertek.day15_review;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.*;
public class WebTableTests extends TestBase {
    /**
     * Write a method that will return count of rows
     *
     */

    WebDriver driver;
    public int getCountOfRows(){
        return driver.findElements(By.cssSelector("#table1 tr")).size();
    }
    /**
     * Write a method that will return count of rows
     * In this case, object of by allows us to specify table locator of any type
     */
    public int getCountOfRows(By by){
        return driver.findElements(by).size();
    }
    @Test
    public void countOfRowsTest1(){
        Assert.assertEquals(getCountOfRows(), 5, "Number of rows doesn't match");
    }
    @Test
    public void countOfRowsTest2(){
        Assert.assertEquals(getCountOfRows(By.xpath("//table[1]//tr")), 5, "Number of rows doesn't match");
    }
    /**
     *  Write a method that returns number of columns
     */
    public int getCountOfColumns(){
        return driver.findElements(By.cssSelector("#table1 th")).size();
    }
    /**
     *  Write a method that returns number of columns
     */
    public int getCountOfColumns(By by){
        return driver.findElements(by).size();
    }
    @Test
    public void countOfColumnsTest1(){
        Assert.assertEquals(getCountOfColumns(), 6, "Number of columns doesn't match");
    }
    @Test
    public void countOfColumnsTest2(){
        Assert.assertEquals(getCountOfColumns(By.xpath("//table[1]//th")), 6, "Number of columns doesn't match");
    }
    /**
     * Let's write a method tha twill return table size
     * first value - number of rows
     * second value - number of columns
     */
    public int[] getTableSize(){
        int[] size = {getCountOfRows(), getCountOfColumns()};
        return size;
    }
    /**
     * Let's write a method tha twill return table size
     * first value - number of rows
     * second value - number of columns
     * by - represents locator for table
     */
    public int[] getTableSize(By rowLocator, By columnLocator){
        int[] size = {getCountOfRows(rowLocator), getCountOfColumns(columnLocator)};
        return size;
    }
    @Test
    public void tableSizeTest1(){
        int[] expectedSize = {5, 6};
        int[] actualSize = getTableSize();
        Assert.assertEquals(actualSize, expectedSize, "Table size doesn't match");
    }
}
