package Gun07;

import Gun06._04_PlaceOrder_Elements;
import Utility.BaseDriver;
import Utility.MyFuction;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Random;


/*
   Senaryo :
   1- Siteyi açınız.
   2- Sitede "ipod" kelimesini aratınız
   3- Çıkan sonuçlardan random birini sepete atınız.
   4- Shopping Chart a tıklatınız.
   5- Seçilen ürünün sepette olduğunu doğrulayınız.
   6- POM ile çözünüz.
 */
public class _04_Soru extends BaseDriver {

    @Test
    @Parameters("searchText")
    public void Test(String text) {
        _04_PlaceOrder_Elements poe = new _04_PlaceOrder_Elements();

        poe.searchBox.sendKeys(text + Keys.ENTER);

        Random random = new Random();
        int number = random.nextInt(poe.addToChart.size());


        poe.addToChart.get(number).click();

        String productName = poe.products.get(number).getText();

        poe.shoppingChart.click();

        boolean found = MyFuction.listContainsString(poe.productsInShoppingCart, productName);

        Assert.assertTrue(found, "Urun Listede Bulunamadi");


    }


}
