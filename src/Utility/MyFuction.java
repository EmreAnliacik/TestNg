package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

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


    public static int randomGenerator(int limit) {
        return (int) (Math.random() * limit);
    }

    public static boolean listContainsString(List<WebElement> list, String searchWord) {
        boolean found = false;
        for (WebElement e : list) {
            if (e.getText().toLowerCase().equals(searchWord.toLowerCase())) {
                found = true;
                break;
            }
        }
        return found;
    }



}
