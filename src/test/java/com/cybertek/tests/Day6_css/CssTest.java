package com.cybertek.tests.Day6_css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.cert.X509CRLSelector;

public class CssTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement dontClick = driver.findElement(By.cssSelector("#disappearing_button"));

        WebElement home = driver.findElement(By.cssSelector(".nav-link"));
        System.out.println("Home= "+home.getText());

        WebElement button3= driver.findElement(By.cssSelector("button[onclick='button3()']"));
        button3.click();

        WebElement Cyber = driver.findElement(By.cssSelector("[target='_blank']"));
        System.out.println(Cyber.getText());

        String message = dontClick.getText();
        System.out.println("Messagre = "+message);
    }
}
