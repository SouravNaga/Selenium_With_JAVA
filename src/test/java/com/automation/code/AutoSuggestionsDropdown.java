package com.automation.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
//Not Working
public class AutoSuggestionsDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        Thread.sleep(4000);
        WebElement searchbox = driver.findElement(By.xpath("//div[contains(@class,\"css-1pahdxg-control\")]"));
        searchbox.click();
        searchbox.sendKeys("red");
//        Thread.sleep(2000);
//        List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class=\" css-1n7v3ny-option\"]"));
//        System.out.println(alloptions.size());

    }
}
