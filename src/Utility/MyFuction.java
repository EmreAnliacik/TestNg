package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MyFuction {

    public static void Wait(int sn){
        try {
            Thread.sleep(sn*1000);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }






    public static void successMessageValidation(){
        WebElement chechMessage = BaseDriver.driver.findElement(By.cssSelector("[class='alert alert-success alert-dismissible']"));
        Assert.assertEquals((chechMessage.getText()), "Success: Your newsletter subscription has been successfully updated!");
    }




}
