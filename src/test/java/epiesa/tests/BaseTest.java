package epiesa.tests;

import org.testng.annotations.BeforeSuite;
import epiesa.pages.HomePage;
import epiesa.pages.BasePage;
import epiesa.pages.LoginPage;



public class BaseTest {
    public BasePage homePage = BasePage.getInstance();
    public LoginPage loginPage = new LoginPage();

    @BeforeSuite
    public void setUp() {
        HomePage.setUp();}
    }



    /*@AfterSuite
    public void tearDown() {BasePage.tearDown();}
     */

