package com.cybertek.tests.Day4_Basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        // enter full name
        WebElement fullnameInput = driver.findElement(By.name("full_name"));
        fullnameInput.sendKeys("nijat tursun");

        // enter email
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("tursunnijat@gmail.com");

        //clicking sign up button
        WebElement signup = driver.findElement(By.name("wooden_spoon"));
        signup.click();

        // Verify that you got " thanks you for signing up. Click the button below to return to the home page."
         WebElement messageElement = driver.findElement(By.name("signup_message"));
         String actualMessage = messageElement.getText();

         String expectedMessage = "Thank you for signing up. Click the button below to return to the home page.";

         if (expectedMessage.equals(actualMessage)){
             System.out.println("Pass");
         }else {
             System.out.println("Fail");
             System.out.println("expectedMessage"+expectedMessage);
         }







    }
}
