package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class tryIt {
    public static WebDriver getDriver(String browserType) {
        WebDriver driver = null;
        for (int i = 0; i < 5; i++) {

            switch (browserType.toLowerCase()) {

                case "chrome":

                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
            }

        }
        return driver;

    }
}
