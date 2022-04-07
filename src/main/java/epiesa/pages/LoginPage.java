package epiesa.pages;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPage extends HomePage {

    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);

    By contulMeu = By.xpath("//a[@class='dropdown-toggle ']");
    By logIn = By.xpath("(//a)[18]");
    By emailAddress = By.xpath("//input[@name='login_utilizator']");
    By password = By.xpath("//input[@name='login_parola']");

    public void logIn(){
        LOG.info("Hover on 'Contul meu'");
        driver.findElement(contulMeu).click();
        LOG.info("Click on 'Login / Cont nou' button");
        driver.findElement(logIn).click();
    }
}
