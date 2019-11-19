package com.cybertek.tests.Day5_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathTest_1 {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement homelink = driver.findElement(By.xpath("//a[@*='_blank']"));
        homelink.click();

        Thread.sleep(3456);
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        Thread.sleep(3456);
        driver.findElement(By.xpath("//button[@onclick='button4()']")).click();
    }
}
