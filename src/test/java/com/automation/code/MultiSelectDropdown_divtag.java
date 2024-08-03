package com.automation.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MultiSelectDropdown_divtag {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        WebElement down = driver.findElement(By.id("cars"));
        // Locate the multi-select dropdown element (for the 4th dropdown)
        WebElement multiSelectDropdown = driver.findElement(By.xpath("//div[@id='selectMenuContainer']/div[7]/div/div/div"));

        // Click to open the dropdown
        multiSelectDropdown.click();

        // Wait for the dropdown options to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'css-11unzgr')]")));

        // Locate the options
        List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class, 'css-11unzgr')]/div"));

        // Select multiple options by clicking on them
        for (WebElement option : options) {
            if (option.getText().equals("Red") || option.getText().equals("Blue")) {
                option.click();
            }
        }

        // Verify the selected options if needed
        WebElement selectedOptions = driver.findElement(By.xpath("//div[@id='selectMenuContainer']/div[7]/div/div/div/div/div/div"));
        System.out.println("Selected options: " + selectedOptions.getText());
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
