package Gun05;

import Utility.BaseDriver;
import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

/*

 Bir önceki taskı PARAMETERDRIVER ile yapınız
 sonrasında farklı tarayıcılar ile çalıştırınız. (crossbrowser)
 sonrasında paralel çalıştırınız.(parallel)
 */
public class _04_Soru extends BaseDriverParameter {
    @Test
    @Parameters("text")
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



}
