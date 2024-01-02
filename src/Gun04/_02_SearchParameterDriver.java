package Gun04;

/*
      Senaryo ;
      1- Siteyi açınız.
      2- mac kelimeini göndererek aratınız.
      3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
      4- aynı işlemi samsung için de yapınız
    */

import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _02_SearchParameterDriver extends BaseDriverParameter {
    @Test
    @Parameters("word")
    public void Test(String word){

        WebElement searchArea = driver.findElement(By.cssSelector("[name='search']"));
        searchArea.sendKeys(word);

        WebElement searchButtuon = driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        searchButtuon.click();

        List<WebElement> products = driver.findElements(By.cssSelector("div[class='caption'] a"));

        for (WebElement x:products){
            Assert.assertTrue(x.getText().toLowerCase().contains(word));
        }








    }




}
