package com.cybertek.tests.Day2_basic_navigation;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class callWebDriverFactory {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =  WebDriverFactory.getDriver("chrome");


        driver.get("http://amazon.com");

        Thread.sleep(3000);
        driver.close();
    }
}
