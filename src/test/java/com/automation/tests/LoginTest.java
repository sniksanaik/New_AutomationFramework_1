package com.automation.tests;



import com.automation.base.BaseTest;
import com.automation.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    
    @Test
    public void testValidLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("testuser");
        loginPage.enterPassword("password123");
        loginPage.clickLogin();

        // Add validation (Example: check URL or error message)
        Assert.assertEquals(driver.getTitle(), "Dashboard - Example");
    }
}

	
