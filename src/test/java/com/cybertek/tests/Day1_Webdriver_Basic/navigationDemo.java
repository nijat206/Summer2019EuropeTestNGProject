package com.cybertek.tests.Day1_Webdriver_Basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class navigationDemo {


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        driver.navigate().to("https://www.facebook.com");

        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
       Thread.sleep(2000);

       driver.navigate().to("https://www.youtube.com");

       driver.navigate().refresh();




    }
}
