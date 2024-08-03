package com.automation.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindAllLinks {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.orangehrm.com/");
        List<WebElement> all_links = driver.findElements(By.tagName("a"));
        System.out.println("Total links: "+all_links.size());
        for (WebElement link : all_links) {
            System.out.println(link.getAttribute("href"));
            }

        driver.close();
    }
}
