package Gun07;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

/*
    Senaryo ;
    1- Siteye gidiniz..

   1.Test;
   2- "ipod" ürününü aratınız."ipod" u xml den gönderiniz
   3- çıkan elamnlardan random bir elelamnı Add Wish butonuna tıklayınız.
   4- Daha sonra WishList e tıklatınız
   5- Burada çıkan ürünle tıklanan ürünün isminin aynı olup olmadığını doğrulayınız.
 */
public class _01_WishList extends BaseDriver {

    @Test
    @Parameters("searchText")
    public void wishListTest(String searchText) {
        WebElement searchBox = driver.findElement(By.name("search"));
        searchBox.sendKeys(searchText + Keys.ENTER);

        List<WebElement> productLabel = driver.findElements(By.cssSelector("[class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']"));

        Random number = new Random();
        int number1 = number.nextInt(productLabel.size());
        System.out.println(number1);

        productLabel.get(number1).findElement(By.cssSelector("button[data-original-title='Add to Wish List']")).click();
        String produvtTitle = productLabel.get(number1).findElement(By.tagName("img")).getAttribute("title");

        System.out.println(produvtTitle);

        WebElement goWishList = driver.findElement(By.linkText("wish list"));
        goWishList.click();


        WebElement wishList = driver.findElement(By.cssSelector("[class='table table-bordered table-hover'] tr > td[class='text-left'] a"));


        Assert.assertEquals(wishList.getText(),produvtTitle);






    }


}
