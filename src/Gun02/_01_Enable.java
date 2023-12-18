package Gun02;

import Utility.MyFuction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class _01_Enable {

    @Test
    public void Test1(){
        System.out.println("Test1 calisti");
    }

    @Test(enabled = false) //bu sayede yorum satirina almadan bu testi deaktif ettik
    public void Test2(){
        System.out.println("Test2 calisti");
    }


    @Test
    public void Test3(){
        System.out.println("Test3 calisti");
    }

    public static WebDriver driver; //Singleton driver method
    public static WebDriverWait wait;

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass Calisti");
        //extend yapilan kodun basinda calisir
        driver=new ChromeDriver();
        driver.manage().window().maximize(); //ekrani max yapar

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); //30 sn sayfayi yukleme muhleti
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        wait = new WebDriverWait(driver,Duration.ofSeconds(20));
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass Calisti");
        MyFuction.Wait(5);
        driver.quit();
    }






}
