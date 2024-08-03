package com.automation.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;
public class MultiSelectDropdown_selecttag {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        WebElement down = driver.findElement(By.id("cars"));
        Select dropdown = new Select(down);
        Boolean b = dropdown.isMultiple();
        System.out.println(b);
        dropdown.selectByVisibleText("Volvo");
        Thread.sleep(1000);
        dropdown.selectByIndex(2);
        dropdown.selectByValue("audi");
        List<WebElement> all_options = dropdown.getAllSelectedOptions();
        for (WebElement allSelectedOption : all_options) {
            System.out.println(allSelectedOption.getText());
        }

        dropdown.deselectByVisibleText("Volvo");
        dropdown.deselectAll();

        Thread.sleep(2000);
        driver.close();

//        Types of Select Methods:
//
//        i. selectByVisibleText Method
//        ii. selectByIndex Method
//        iii. selectByValue Method
//
//        Types of DeSelect Methods:
//        i. deselectByVisibleText Method
//        ii. deselectByIndex Method
//        iii. deselectByValue Method
//        iv. deselectAll Method
    }
}
