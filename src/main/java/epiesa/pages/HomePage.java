package epiesa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

public class HomePage extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(HomePage.class);
    public static HomePage instance;
    private final By navBar= By.xpath("//nav[@class=\"navbar navbar-gg\"]");
    public static HomePage getInstance() {
        if (instance == null) {
            instance = new HomePage();
        }
        return instance;
    }
    public boolean checkNavIsDisplayed(){
        LOG.info("Check navbar is displayed");
        return driver.findElement(navBar).isDisplayed();


    }
    public boolean checkNavBarIsDisplayed(){
        LOG.info("Check navbar is displayed");
        return driver.findElement(navBar).isDisplayed();
    }
}
