package com.cybertek.tests.Day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class RadioButtonTest {
    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement red =driver.findElement(By.cssSelector("#red"));
        WebElement blue =driver.findElement(By.cssSelector("#blue"));

        System.out.println("is red selected: "+red.isSelected());
        System.out.println("is blue selected: "+blue.isSelected());

        Assert.assertTrue(blue.isSelected(),"Verify that blue button is selected");

        Assert.assertFalse(red.isSelected(),"Verify that red button is selected");

        red.click();
        driver.quit();



    }
    @AfterMethod
    public void test2() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com");
        Thread.sleep(3456);
        driver.quit();
    }
}
