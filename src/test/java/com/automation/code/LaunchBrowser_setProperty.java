package com.automation.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser_setProperty {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        // Create a new instance of the Edge driver
        WebDriver driver = new EdgeDriver();

        // Navigate to a web page
        driver.get("https://www.google.com");

        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
