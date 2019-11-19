package com.cybertek.tests.Day5_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebook {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://facebook.com");

        // enter full name
        WebElement emailInput = driver.findElement(By.xpath("//input[@*='email']"));
        emailInput.sendKeys("tursun@hotmail.com");

        // enter email
        WebElement passwordInput = driver.findElement(By.xpath("//input[@*='password']"));
        passwordInput.sendKeys("12345");

        //clicking sign up button
        WebElement signup = driver.findElement(By.xpath("//input[@*='Log In']"));
        signup.click();

        driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110");
        Thread.sleep(3456);

        WebElement Email = driver.findElement(By.xpath("//input[contains(@name,'email')]"));
        Email.sendKeys("tursunnijat@gmail.com");

        WebElement Password = driver.findElement(By.xpath("//input[contains(@name,'pass')]"));
        Password.sendKeys("235928530390jfwdsvj");

        WebElement Login = driver.findElement(By.xpath("//button[contains(@name,'login')]"));
        Login.click();

        WebElement New = driver.findElement(By.xpath("//a[@*='button']"));
        New.click();

        driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110");
        Thread.sleep(3456);

        WebElement Forgotten = driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
      Forgotten.click();

       driver.get("https://www.facebook.com/recover/code/?em[0]=tursun%40hotmail.com&rm=send_email&fl=skip_initiate_view&src_flow=skip_initiate&hash=AUamQ2wmz_0NF9j8");
       Thread.sleep(3456);

       WebElement Code = driver.findElement(By.xpath("//input[@*='text']"));
       Code.sendKeys("123456");

       driver.findElement(By.xpath("//button[@*='1']")).click();

       driver.findElement(By.xpath("//*[text()='Cancel']")).click();






       driver.get("https://www.facebook.com/");
       Thread.sleep(3456);


       WebElement first = driver.findElement(By.xpath("//input[@*='First name']"));
       first.click();
       first.sendKeys("Nijat");


      WebElement surname= driver.findElement(By.xpath("//input[@*='Surname']"));
      surname.sendKeys("Tursun");

      WebElement mobilnumber= driver.findElement(By.xpath("//input[@*='Mobile number or email address']"));
     mobilnumber.click();
      mobilnumber.sendKeys("93234543");

      WebElement password =driver.findElement(By.xpath("//input[@*='New password']"));
       password.click();
      password.sendKeys("Njityugf456");

       WebElement day=driver.findElement(By.xpath("//select[@*='Day']"));
       day.sendKeys("12");

        WebElement month= driver.findElement(By.xpath("//select[@*='Month']"));
        month.sendKeys("2");

       WebElement year= driver.findElement(By.xpath("//select[@*='Year']"));
       year.sendKeys("1985");

       WebElement sex = driver.findElement(By.xpath("//input[@*='2']"));
       sex.click();


    }
}
