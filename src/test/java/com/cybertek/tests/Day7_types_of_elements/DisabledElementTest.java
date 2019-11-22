package com.cybertek.tests.Day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElementTest {
    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement green = driver.findElement(By.cssSelector("#green"));

        System.out.println("Is element enabled"+green.isEnabled());

        Assert.assertFalse(green.isEnabled(),"Verify that green is enable");
        green.click();

    }
    @Test
    public void test2() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement enable = driver.findElement(By.cssSelector("#input-example > input[type=text]"));

        System.out.println("is input eneble:"+enable.isEnabled());
       // enable.sendKeys("nijat");
    }
}