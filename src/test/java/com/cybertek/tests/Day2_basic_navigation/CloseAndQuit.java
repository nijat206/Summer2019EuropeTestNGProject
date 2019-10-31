package com.cybertek.tests.Day2_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

      //  driver.get("https://practice.cybertekschool.com");
      //  Thread.sleep(3000);

        //driver.close();

        driver.get("http://practice.cybertekschool.com/open_new_tab");

        Thread.sleep(3000);

        driver.close();

        driver = new ChromeDriver();

        driver.get("http://www.cybertekschool.com");
        Thread.sleep(3000);
        driver.quit();

        driver = new ChromeDriver();

        driver.get("http://www.facewbook.com");
        Thread.sleep(3000);
        driver.quit();

        driver = new ChromeDriver();

        driver.get("http://www.youtube.com");
        Thread.sleep(3000);
        driver.quit();

        driver = new ChromeDriver();

        driver.get("http://www.cnn.com");
        Thread.sleep(3000);
        driver.quit();

        driver = new ChromeDriver();

        driver.get("http://www.bbc.com");
        Thread.sleep(3000);
        driver.quit();

        driver = new ChromeDriver();

        driver.get("http://www.car.com");
        Thread.sleep(3000);
        driver.quit();









    }
}
