package Gun06;


import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/*
   Senaryo :
   1- Siteyi açınız.
   2- Sitede "ipod" kelimesini aratınız
   3- Çıkan sonuçlardan ilkini sepete atınız.
   4- Shopping Chart a tıklatınız.
   5- Checkout yapınız.
   6- Continue butonalarına tıklatıp bilgileri giriniz.
   7- En confirm ile siparişi verdiğinizi doğrulayınız.
      doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
*/
public class _03_PlaceOrder extends BaseDriver {

    @Test
    public void ProceedToCheckout() {
        WebElement searchBox = driver.findElement(By.name("search"));
        searchBox.sendKeys("ipod" + Keys.ENTER);

        WebElement addToChart = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
        addToChart.click();

        WebElement shoppingChart = driver.findElement(By.linkText("Shopping Cart"));
        shoppingChart.click();

        WebElement checkOut = driver.findElement(By.linkText("Checkout"));
        checkOut.click();

        WebElement continue1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-address")));
        continue1.click();

        WebElement continue2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-address")));
        continue2.click();

        WebElement continue3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-method")));
        continue3.click();

        WebElement agree = wait.until(ExpectedConditions.elementToBeClickable(By.name("agree")));
        agree.click();

        WebElement continue4 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-method")));
        continue4.click();

        WebElement confirm = driver.findElement(By.id("button-confirm"));
        confirm.click();

        //wait.until(ExpectedConditions.urlToBe("http://opencart.abstracta.us/index.php?route=checkout/success"));
        wait.until(ExpectedConditions.urlContains("success"));

        WebElement screenLetter = driver.findElement(By.xpath("//div[@id='content']/h1"));
        Assert.assertTrue(screenLetter.getText().equals("Your order has been placed!"));
    }

}
