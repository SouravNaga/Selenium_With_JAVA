package com.automation.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        WebElement ddown = driver.findElement(By.tagName("select"));
        Select dropdown = new Select(ddown);
        dropdown.selectByVisibleText("Aruba");
        Thread.sleep(2000);
        dropdown.selectByIndex(3);
        Thread.sleep(2000);
        dropdown.selectByValue("DZA");
        Thread.sleep(2000);
        driver.close();
    }
}
