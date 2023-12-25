package Gun03;

   /*
  Senaryo
  1- Siteyi açınız.
  2- Edit Account sayfasına ulaşınız.
  3- Ad ve soyadı değiştirip tekrar kaydedidiniz.
 */

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Example extends BaseDriver {

    @Test
    public void AccountEditTest(){

        WebElement editAccount = driver.findElement(By.cssSelector("a[href='https://opencart.abstracta.us:443/index.php?route=account/edit']"));
        editAccount.click();

        WebElement name = driver.findElement(By.id("input-firstname"));
        name.clear();
        name.sendKeys("Ismet");

        WebElement surName = driver.findElement(By.id("input-lastname"));
        surName.clear();
        surName.sendKeys("Temur");

        WebElement continueButton = driver.findElement(By.cssSelector("input[value='Continue']"));
        continueButton.click();

        WebElement chechMessage = BaseDriver.driver.findElement(By.cssSelector("[class='alert alert-success alert-dismissible']"));
        Assert.assertEquals((chechMessage.getText()), "Success: Your account has been successfully updated.");



    }




}
