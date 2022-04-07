package epiesa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;


public class BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);
    public static WebDriver driver;

    public static void setUP() {
        LOG.info("Start test");
        System.setProperty("webdriver.chrome.driver","C:\\WEBDRIVERS");
        driver = new ChromeDriver();
        String url = "https://www.epiesa.ro/";
        driver.get(url);
        LOG.info("Open browser");

        Dimension dimension = new Dimension(1366,768);
        driver.manage().window().setSize(dimension);
        driver.manage().window().maximize();

    }

    public boolean checkNavIsDisplayed() {
    }

    public static void tearDown() {
        LOG.info("Close the browser");
        driver.quit();
    }

    public static void sleep(long ms){
        try {
            Thread sleep(ms)
        }
    }
}
