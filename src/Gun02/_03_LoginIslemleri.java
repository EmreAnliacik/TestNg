package Gun02;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_LoginIslemleri extends BaseDriver {

    @Test(priority = 1)
    public void LoginPageTest(){
        driver.get("https://opencart.abstracta.us/");

        WebElement myAccount = driver.findElement(By.cssSelector("a[href='https://opencart.abstracta.us:443/index.php?route=account/account']"));
        myAccount.click();
        WebElement login = driver.findElement(By.cssSelector("a[href='https://opencart.abstracta.us:443/index.php?route=account/login']"));
        login.click();

    }

    @Test(priority = 2)
    public void AccountLoginTest(){

        WebElement email = driver.findElement(By.cssSelector("[name='email']"));
        email.sendKeys("campus1@gamil.com");
        WebElement password = driver.findElement(By.cssSelector("[name='password']"));
        password.sendKeys("12345");
        WebElement login = driver.findElement(By.cssSelector("[value='Login']"));
        login.click();
        WebElement checkLogin = driver.findElement(By.xpath("//h2[text()='My Account']"));
        Assert.assertTrue((checkLogin.getText()).contains("My Account"), "Failed");
        System.out.println(checkLogin.getText());
    }








}
