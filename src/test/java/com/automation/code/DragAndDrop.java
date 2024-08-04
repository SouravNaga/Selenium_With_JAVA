package com.automation.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        Actions a = new Actions(driver);
        WebElement w= driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
        driver.switchTo().frame(w);
        WebElement drag_loc = driver.findElement(By.id("draggable"));
        WebElement drop_loc = driver.findElement(By.id("droppable"));
        a.dragAndDrop(drag_loc,drop_loc).build().perform();

        driver.close();

    }
}
