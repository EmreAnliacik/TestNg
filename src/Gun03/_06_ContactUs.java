package Gun03;


import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
  1- ContactUs a tıklayınız
  2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
  3- Submit ettikten sonra Contact US yazısını doğrulayınız.
 */
public class _06_ContactUs extends BaseDriver {
    @Test
    public void ContactTest() {

        WebElement contact = driver.findElement(By.cssSelector("ul[class='list-unstyled'] [href='http://opencart.abstracta.us:80/index.php?route=information/contact']"));
        contact.click();

        WebElement fill = driver.findElement(By.id("input-enquiry"));
        fill.sendKeys("Merhadak;;;d;d;aba");

        WebElement submit = driver.findElement(By.cssSelector("[type='submit']"));
        submit.click();

        WebElement confirm = driver.findElement(By.xpath("//h1[text()='Contact Us']"));

        Assert.assertTrue(confirm.getText().equals("Contact Us"));


    }


}
