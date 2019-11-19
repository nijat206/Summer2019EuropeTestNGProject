package com.cybertek.tests.Day5_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

     WebElement homelink = driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
       homelink.click();

        Thread.sleep(3456);
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        Thread.sleep(3456);
        driver.findElement(By.xpath("/html/body/div/div/div/div/button[2]")).click();


        System.out.println(driver.findElement(By.xpath("/html/body/div/div[2]/div/div/p")).getText());

        //58 minut ta tohtudum
    }
}
