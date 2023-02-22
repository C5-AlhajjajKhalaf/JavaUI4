package com.example.hotmail.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage extends Page {

    private final String TITLE = "Sign In";

    private final String ERROR_XPATH = "//div[contains(@class, 'errorDiv')]";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

  

    public void clickCantAccessYourAccountLink() {
        WebElement link = driver.findElement(By.xpath("//div[@id='idDiv_PWD_ForgotPassword']/a"));
        link.click();
    }
}
