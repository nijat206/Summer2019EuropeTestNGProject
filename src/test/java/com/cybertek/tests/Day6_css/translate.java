package com.cybertek.tests.Day6_css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class translate {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://translate.google.no/?hl=en&tab=wT1");

        WebElement translation = driver.findElement(By.cssSelector("body > div.frame > div.page.tlid-homepage.homepage.translate-text > div.homepage-content-wrap > div.tlid-source-target.main-header > div.source-target-row > div.tlid-input.input > div.tlid-language-bar.ls-wrap > div.sl-wrap > div.sl-more.tlid-open-source-language-list"));
        translation.click();

        Thread.sleep(4567);

        WebElement search = driver.findElement(By.cssSelector("#sl_list-search-box"));
        search.sendKeys("Turkish");
        search.click();

        Thread.sleep(4567);

        WebElement turkish = driver.findElement(By.cssSelector("body > div.frame > div.page.tlid-language-picker-page.language-picker-page > div > div.outer-wrap > div:nth-child(1) > div:nth-child(3) > div.language_list_item_wrapper.language_list_item_wrapper-tr"));
        turkish.click();

        Thread.sleep(4567);

        WebElement word = driver.findElement(By.cssSelector("#source"));
        word.sendKeys("'NATO'nun beyin ölümü gerçekleşti.' sözüne karşı NATO'nun halen canlı olduğunu ve bölgenin ve müttefiklerin güvenliği için en önemli teşkilat olduğunu, bundan sonra da önemini devam ettireceğini vurguladı.\" diye konuştu.\n" +
                "\n" +
                "Toplantıda bütçe ve diğer öncelikli konuların da gündeme geldiğini kaydeden Çavuşoğlu, \"Biz de yaptığımız konuşmada özellikle NATO içinde dayanışmanın önemine vurgu yaptık ve terörle mücadelenin önemini, terör örgütleri arasında ayrım yapılmadan mücadelenin önemini vurguladık. Bu vesileyle de Barış Pınarı Harekatı'mızın önemini bir kere daha anlattık ki bu esasen sadece bizim için değil, NATO ittifakı için de önemli bir harekattı. Bundan sonraki süreçte atılması gereken adımları da değerlendirmiş bulunduk. Çalışma yemeğinde de bazı bölgesel konuları ve yeni ortaya çıkan tehditleri de gayriresmi bir ortamda ele alacağız.\" dedi.\n" +
                "\n" +
               "");

        Thread.sleep(3456);

        WebElement chose = driver.findElement(By.cssSelector("body > div.frame > div.page.tlid-homepage.homepage.translate-text > div.homepage-content-wrap > div.tlid-source-target.main-header.small-font > div.source-target-row > div.tlid-input.input > div.tlid-language-bar.ls-wrap > div.tl-wrap > div.tl-more.tlid-open-target-language-list"));
        chose.click();

        Thread.sleep(4567);

        WebElement chinese = driver.findElement(By.cssSelector("#tl_list-search-box"));
        chinese.sendKeys("Chinese");

        Thread.sleep(4567);

        WebElement enter = driver.findElement(By.cssSelector("body > div.frame > div.page.tlid-language-picker-page.language-picker-page > div > div.outer-wrap > div:nth-child(2) > div:nth-child(3) > div.language_list_item_wrapper.language_list_item_wrapper-zh-CN"));
        enter.click();

        Thread.sleep(4567);

        WebElement Chose = driver.findElement(By.cssSelector("body > div.frame > div.page.tlid-homepage.homepage.translate-text > div.homepage-content-wrap > div.tlid-source-target.main-header.small-font > div.source-target-row > div.tlid-input.input > div.tlid-language-bar.ls-wrap > div.tl-wrap > div.tl-more.tlid-open-target-language-list"));
        Chose.click();

        Thread.sleep(4567);

        WebElement norwegian= driver.findElement(By.cssSelector("#tl_list-search-box"));
        norwegian.sendKeys("Norwegian");

        Thread.sleep(4567);

        WebElement Norsk = driver.findElement(By.cssSelector("body > div.frame > div.page.tlid-language-picker-page.language-picker-page > div > div.outer-wrap > div:nth-child(2) > div:nth-child(3) > div.language_list_item_wrapper.language_list_item_wrapper-no"));
        Norsk.click();

        Thread.sleep(5678);
        driver.quit();



    }
}
