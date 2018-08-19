package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELECT2 = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECT3 = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        while (!driver.findElement(By.xpath(XPATH_SELECT)).isDisplayed());

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECT));
        Select selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(17);

        while (!driver.findElement(By.xpath(XPATH_SELECT2)).isDisplayed());

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_SELECT2));
        Select selectBoard2 = new Select(selectCombo2);
        selectBoard2.selectByIndex(5);

        while (!driver.findElement(By.xpath(XPATH_SELECT3)).isDisplayed());

        WebElement selectCombo3 = driver.findElement(By.xpath(XPATH_SELECT3));
        Select selectBoard3 = new Select(selectCombo3);
        selectBoard3.selectByIndex(32);
    }

}
