package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.setBinary("/usr/bin/chromium-browser");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://practicetestautomation.com/practice-test-login/");

        try { Thread.sleep(2000); } catch (Exception e) {}

        driver.findElement(By.id("username")).sendKeys("student");

        try { Thread.sleep(2000); } catch (Exception e) {}

        driver.findElement(By.id("password")).sendKeys("Password123");

        try { Thread.sleep(2000); } catch (Exception e) {}

        driver.findElement(By.id("submit")).click();

        try { Thread.sleep(6000); } catch (Exception e) {}

        System.out.println("Login Done");

        driver.quit();
    }
}
