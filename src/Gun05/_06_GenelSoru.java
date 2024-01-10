package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/*
  Senaryo;
  1- Brands menusune gidiniz.
  2- Burada her bir markanın üstünde yer alan harf ile başladığını doğrulayınız
*/
public class _06_GenelSoru extends BaseDriver {

    @Test
    public void brandsValidation(){

        WebElement brandPage = driver.findElement(By.linkText("Brands"));
        brandPage.click();

        List<WebElement> harfler = driver.findElements(By.cssSelector("div[id='content'] > h2")); //harfleri aldik
        List<WebElement> markaSatirlari = driver.findElements(By.cssSelector("div[id='content'] > div")); //marklarin bulundugu satirlari aldik

        for (int i = 0; i < harfler.size(); i++) {
            System.out.println(harfler.get(i).getText());
          List<WebElement> markalar = markaSatirlari.get(i).findElements(By.tagName("div")); //Mesela ilk basta 1.satirdaki tum markalari aldik
            //element icnde element aranirken xpath kullanilmaz, cunku o tum sayfaya bakar
            for (WebElement m:markalar ){
                System.out.println(harfler.get(i).getText()+" "+m.getText());
                Assert.assertEquals(harfler.get(i).getText().charAt(0),m.getText().charAt(0));  //Mesela 1.satirdaki markalarla 1.harfi karsilastirdik
            }

        }







    }




}
