package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Main {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.findElement(By.id("cookieseal-banner-accept")).click();
        driver.manage().window().maximize();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        driver.findElement(By.xpath("//a[@class='menu-header-item__title'][normalize-space()='ERKEK']")).click();
        js.executeScript("window.scrollBy(0,1000)");

        driver.findElement(By.xpath("//div[4]//div[1]//a[1]//img[1]")).click();
        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.xpath(
                "//body/div[@id='root']/div[@class='page-wrapper']/div[@class='product-list-container']/div[@class='product-list']/div[@class='container-fluid']/div[@class='product-list__content-area']/div[@class='product-grid']/div[8]/a[1]/div[1]/img[1]"))
            .click();

        driver.findElement(By.xpath(
                "//div[@class='col-xs-12 size-area main-size-area pt-5']//div[@class='option-sizes size-area ucOptionSizeSelector mt-0 mb-0']//div[@id='option-size']//a[@href='javascript:;'][normalize-space()='M']"))
            .click();

        driver.findElement(By.xpath("//a[@id='pd_add_to_cart']")).click();

        driver.findElement(By.xpath("//span[normalize-space()='Sepetim']")).click();
//        driver.findElement(By.xpath("//div[contains(@class,'cart-dropdown--active')]//div[2]//a[1]")).click();
        driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M12885 364')]")).click();

        driver.close();
    }
}



