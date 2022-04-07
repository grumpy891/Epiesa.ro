package epiesa.tests;


import epiesa.pages.BasePage;
import epiesa.pages.ShoppingCart;
import org.testng.Assert;
import org.testng.annotations.Test;




public class HomePageTest extends BaseTest {
    @Test
    public void testNavIsDisplayed(){
        Assert.assertEquals("https://www.epiesa.ro/", ShoppingCartPage.getUrl());
        Assert.assertTrue(homePage.checkNavIsDisplayed());

        Assert.assertTrue(homePage.checkCarPickBoxIsDisplayed());

        Assert.assertEquals("PIESE AUTO ONLINE", homePage.getPieseAutoBoxText());

    }
}
}
