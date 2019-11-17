package com.cybertek.tests.Day4_Basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameLocatorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        // enter full name
        WebElement fullnameInput = driver.findElement(By.tagName("input"));
        fullnameInput.sendKeys("Nijat Tursun ");

        // enter email
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("tursun@gmail.com");

        Thread.sleep(3005);

        // Click the button
        WebElement signUpButton = driver.findElement(By.tagName("button"));
        signUpButton.click();

        // Verify that you got " thanks you for signing up. Click the button below to return to the home page."
        WebElement messageElement = driver.findElement(By.tagName("h3"));
        String actualMessage = messageElement.getText();

        String expectedMessage = "Thank you for signing up. Click the button below to return to the home page.";

        if (expectedMessage.equals(actualMessage)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
            System.out.println("expectedMessage"+expectedMessage);
        }


        Thread.sleep(3005);

    }
}
