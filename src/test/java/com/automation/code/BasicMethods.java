//package com.automation.code;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class BasicMethods {
//    @Deprecated
//    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
////        Browser Navigation
//        driver.get("https://demowebshop.tricentis.com/");
//        String currentUrl = driver.getCurrentUrl();
//        String currentUrl1 = driver.getCurrentUrl();
//        String title = driver.getTitle();
//        String pageSource = driver.getPageSource();
//        driver.navigate().to("http://example.com");
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();
//
////        Element Interaction
//        WebElement element = driver.findElement(By.id("element_id"));
//        List<WebElement> elements = driver.findElements(By.className("elements_class"));
//        element.click();
//        element.sendKeys("text to enter");
//        element.clear();
//        String text = element.getText();
//        String value = element.getAttribute("attribute_name");
//        String color = element.getCssValue("color");
//        boolean isDisplayed = element.isDisplayed();
//        boolean isEnabled = element.isEnabled();
//        boolean isSelected = element.isSelected();
//
////        Handling Alerts
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//        alert.dismiss();
//        String alertText = alert.getText();
//        alert.sendKeys("text to enter");
//
////        Handling Frames and Windows
//        driver.switchTo().frame(0);
//        driver.switchTo().frame("frame_name");
//        driver.switchTo().frame(element1);
//        driver.switchTo().defaultContent();
//        Set<String> windowHandles = driver.getWindowHandles();
//        String currentWindowHandle = driver.getWindowHandle();
//        driver.switchTo().window(handle);
//
////        Browser Management
//        driver.manage().window().maximize();
//        driver.manage().window().minimize();
//        driver.manage().window().fullscreen();
//        driver.manage().window().setSize(new Dimension(1024, 768));
//
////        Timeouts
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
//
////        Handling Cookies
//        Set<Cookie> cookies = driver.manage().getCookies();
//        Cookie cookie = driver.manage().getCookieNamed("cookie_name");
//        driver.manage().addCookie(new Cookie("cookie_name", "cookie_value"));
//        driver.manage().deleteCookie(cookie1);
//        driver.manage().deleteCookieNamed("cookie_name");
//        driver.manage().deleteAllCookies();
//
////        JavaScript Executor
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("return document.title;");
//
//        js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
//
////        Taking Screenshots
//        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        byte[] screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//
//
//
//    }
//}
