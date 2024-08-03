package com.automation.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FlipkartTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        WebElement searchbox = driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]"));
        searchbox.sendKeys("vivo t2 pro");
        Thread.sleep(2000);
        List<WebElement> allsearched = driver.findElements(By.xpath("//div[@class=\"YGcVZO _2VHNef\"]"));
        String phone = "vivo t2 pro";
        int count = 0;
        for (WebElement option : allsearched) {
            System.out.println(option.getText());
            if (option.getText().equalsIgnoreCase(phone)) {
                option.click();
                count = 1;
                break;
            }

        }
        if (count == 0) {
            System.out.println("Mobile not found");
            driver.close();
        } else {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter RAM: ");
            int ram = myObj.nextInt();
            if (ram == 128 || ram == 256) {
                String main_handle = driver.getWindowHandle();
                String xpathExpression = String.format("//div[normalize-space()=\"vivo T2 Pro 5G (Dune Gold, %d GB)\"]", ram);
                driver.findElement(By.xpath(xpathExpression)).click();
                Set<String> all_handles = driver.getWindowHandles();
                for(String page:all_handles)
                {
                    if(!page.equals(main_handle))
                    {
                        driver.switchTo().window(page);
                        //System.out.println(driver.getCurrentUrl());
                        List<WebElement> all_details = driver.findElements(By.xpath("//li[@class=\"_7eSDEz\"]"));
                        System.out.println("Below mentioned all details about phone: ");
                        for(WebElement details:all_details)
                        {
                            System.out.println(details.getText());
                        }
                    }
                }
                Thread.sleep(1000);
                driver.quit();

            } else {
                System.out.println("This mobile not available");
                driver.close();
            }
        }

    }
}
