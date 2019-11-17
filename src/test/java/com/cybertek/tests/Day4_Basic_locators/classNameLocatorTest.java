package com.cybertek.tests.Day4_Basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class classNameLocatorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        Thread.sleep(3456);
        WebElement homelink = driver.findElement(By.className("nav-link"));
        homelink.click();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement print = driver.findElement(By.className("h3"));
        print.getText();
        System.out.println(driver.findElement(By.className("h3")).getText());
    }
}
