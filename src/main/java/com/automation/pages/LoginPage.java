package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("loginBtn");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys("snik");
        Thread.sleep(9000);
    }
  

    public void enterPassword(String password) throws InterruptedException {
        driver.findElement(By.id("password")).sendKeys("password");
        Thread.sleep(9000);
    }

    public void clickLogin() throws InterruptedException {
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(12000);
    }
    
}
