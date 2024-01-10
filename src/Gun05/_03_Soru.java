package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

/*

 Daha önceki derslerde yaptğımız Search fonksiyonunu
 mac,ipod ve samsung için Dataprovider ile yapınız.
 */
public class _03_Soru extends BaseDriver {
    @Test(dataProvider = "SearchText")
    public void Test(String word) {

        WebElement searchArea = driver.findElement(By.cssSelector("[name='search']"));
        searchArea.sendKeys(word);


        WebElement searchButtuon = driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        searchButtuon.click();

        WebElement searchAreanew =driver.findElement(By.xpath("//*[@name='search'][1]"));
        searchAreanew.clear();



        List<WebElement> products = driver.findElements(By.cssSelector("div[class='caption'] a"));
        System.out.println(products.size());

        for (WebElement x : products) {
            Assert.assertTrue(x.getText().toLowerCase().contains(word));
        }

    }

    @DataProvider
    Object[] SearchText(){
        Object[] text = {"mac","ipod","samsung"};
        return text;



    }
}
