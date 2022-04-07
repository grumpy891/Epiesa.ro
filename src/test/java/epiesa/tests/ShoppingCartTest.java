package epiesa.tests;
import epiesa.pages.ShoppingCart;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartTest extends BaseTest {

    @Test
    public void testShoppingCartButton();
       ShoppingCart.clickShoppingCartButton();
        Assert.assertEquals("https://www.epiesa.ro/cos-cumparaturi-epiesa/",ShoppingCart.getUrl());

        Assert.assertEquals("COSUL TAU ESTE GOL\n" +
                "Pentru a adauga produse in cos\n" +
                "te rugam sa te intorci in magazin\n" +
                "INTOARCE-TE IN MAGAZIN", ShoppingCart.getReturnText());
        ShoppingCart.clickReturnButton();
        Assert.assertTrue(homePage.checkNavIsDisplayed());
    }
}
