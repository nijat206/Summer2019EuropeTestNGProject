package com.cybertek.tests.Day6_css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class finn {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.finn.no/");
        WebElement Click = driver.findElement(By.cssSelector("button[type='button']"));
        Click.click();

        WebElement car = driver.findElement(By.cssSelector("#frontpage-content > main > div.grid > div.grid__unit.u-r-size2of3 > nav > div:nth-child(3) > a > svg"));
        car.click();

        WebElement biler = driver.findElement(By.cssSelector("#search-links > ul > li:nth-child(1) > a"));
        biler.click();

        WebElement sok = driver.findElement(By.cssSelector("#query-input"));
        sok.sendKeys("mercedes-benz gl");

        WebElement enter = driver.findElement(By.cssSelector("body > div.pageholder > div.grid > div.grid__unit.u-r-size1of3 > div > form > div.input.input--search > button"));
        enter.click();

        WebElement GL = driver.findElement(By.cssSelector("#sort"));
        GL.click();

        WebElement hoy = driver.findElement(By.cssSelector("#sort > option:nth-child(4)"));
        hoy.click();

    }
}
