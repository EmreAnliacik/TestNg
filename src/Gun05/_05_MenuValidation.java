package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/*
  Senaryo
  1- Siteyi açınız.
  2- Top Menudeki menu elemanlarının olduğunu doğrulayınız.(menuValidation)
  3- Desktops, Laptops & Notebooks, Components, Tablets, Software, Phones & PDAs, Cameras, MP3 Players
 */
public class _05_MenuValidation extends BaseDriver {
@Test
        public void MenuValidation() {
    List<WebElement> WebMenu = driver.findElements(By.cssSelector("[class='nav navbar-nav'] > li >a"));


    List<String> expectedList = new ArrayList<>();
    expectedList.add("Desktops");
    expectedList.add("Laptops & Notebooks");
    expectedList.add("Components");
    expectedList.add("Tablets");
    expectedList.add("Software");
    expectedList.add("Phones & PDAs");
    expectedList.add("Cameras");
    expectedList.add("MP3 Players");

    Assert.assertTrue(WebMenu.size()==expectedList.size());

    for (int i = 0; i <WebMenu.size() ; i++) {
        Assert.assertTrue(WebMenu.get(i).getText().equals(expectedList.get(i)));
    }




}
}
