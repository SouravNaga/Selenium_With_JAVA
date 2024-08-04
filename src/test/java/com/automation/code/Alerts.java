package com.automation.code;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"));
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//        jsExecutor.executeScript("document.body.style.zoom='50%'");


//        Click Button to see alert------------
        WebElement alert1 = driver.findElement(By.id("alertButton"));
        alert1.click();
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert Text: " + alert.getText());
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);

//        On button click, confirm box will appear
        WebElement alert3 = driver.findElement(By.id("confirmButton"));
        alert3.click();
        Alert confirmation_alert = driver.switchTo().alert();
        System.out.println("Confirmation alert text - "+confirmation_alert.getText());
        confirmation_alert.dismiss();
        Thread.sleep(2000);


        WebElement alert4 = driver.findElement(By.id("promtButton"));
        alert4.click();
        Alert prompt_alert = driver.switchTo().alert();
        prompt_alert.sendKeys("test");
        Thread.sleep(2000);
        System.out.println("Prompt Text: " + prompt_alert.getText());
        System.out.println("Test");

//        prompt_alert.accept();
//        driver.close();
    }
}
