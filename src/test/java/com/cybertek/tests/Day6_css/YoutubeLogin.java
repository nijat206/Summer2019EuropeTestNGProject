package com.cybertek.tests.Day6_css;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YoutubeLogin {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.youtube.com/");

       WebElement search = driver.findElement(By.cssSelector("input#search"));
       search.sendKeys("dirilis musik");

       WebElement enter = driver.findElement(By.cssSelector("button#search-icon-legacy"));
       enter.click();

       WebElement erturul = driver.findElement(By.cssSelector("[title='Diriliş \"Ertuğrul\" Jenerik Müziği']"));
       erturul.click();

    }
}
