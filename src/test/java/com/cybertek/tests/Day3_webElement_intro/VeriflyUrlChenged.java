package com.cybertek.tests.Day3_webElement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VeriflyUrlChenged {
    /**
     * Verify URL changed
     * open browser
     * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
     * enter any email
     * click on Retrieve password
     * verify that url changed to http://practice.cybertekschool.com/email_sent
     */
    public static void main(String[] args) throws InterruptedException {
        // open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
        driver.get("http://practice.cybertekschool.com/forgot_password");



        //* enter any email
        WebElement inputBox = driver.findElement(By.name("email"));
        inputBox.sendKeys("tursunnijat@gmail.com");

        //     /* c lick on Retrieve password
        WebElement retrievePasswordButtom = driver.findElement(By.id("form_submit"));
        retrievePasswordButtom.click();

        // * verify that url changed to http://practice.cybertekschool.com/email_sent
        String expectedUrl = " http://practice.cybertekschool.com/email_sent";

        // * save url after clicking button
        String actualUrl = driver.getCurrentUrl();

        // * verify that url did not change
        if(expectedUrl.equals(actualUrl)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }



        Thread.sleep(3005);
        driver.quit();
    }
}
