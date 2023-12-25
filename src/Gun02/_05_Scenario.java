package Gun02;

import Utility.BaseDriver;
import Utility.MyFuction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _05_Scenario extends BaseDriver {

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

    @Test(priority = 3)
    public void newsLetterSub(){

        WebElement newsLetter = driver.findElement(By.linkText("Newsletter"));
        newsLetter.click();
        WebElement yes = driver.findElement(By.cssSelector("input[name='newsletter'][value = '1']"));
        yes.click();
        WebElement contu = driver.findElement(By.cssSelector("[value='Continue']"));
        contu.click();
        MyFuction.successMessageValidation();

    }


    





}
