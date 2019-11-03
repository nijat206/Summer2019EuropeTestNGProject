package com.cybertek.tests.Day3_webElement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLnotchanged {

    /**
     * Verify URL not changed
     * open browser
     * go to http://practice.cybertekschool.com/forgot_password Links to an external site.
     * click on Retrieve password
     * verify that url did not change
     *
     */


    public static void main(String[] args) throws InterruptedException {
        //   * open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //  * go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        driver.get("http://practice.cybertekschool.com/forgot_password");

        // save url to string variable
        String expectedUrl = driver.getCurrentUrl();

        //  * click on Retrieve password
        WebElement retrievePasswordButtom = driver.findElement(By.id("form_submit"));
        retrievePasswordButtom.click();

        // * save url after clicking button
        String actualUrl = driver.getCurrentUrl();

        // * verify that url did not change
        if(expectedUrl.equals(actualUrl)){
            System.out.println("Pass");
        }else{
            System.out.println("fail");
        }


        Thread.sleep(3005);
        driver.quit();

    }
}
