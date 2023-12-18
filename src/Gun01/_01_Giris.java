package Gun01;

import org.testng.annotations.Test;

public class _01_Giris {

    //Default olarak alfabetik siraya gore calisir



    @Test(priority = 1)
    public void driverIslemleriap() {
        System.out.println("driverIslemleriniYap");

    }

    @Test(priority = 2)
    public void webSitesiniAc() {
        System.out.println("Web sitesini Ac");

    }

    @Test(priority = 3)
    public void LoginTestiniYap() {
        System.out.println("LoginTestiniYap");

    }


    @Test(priority = 4)
    public void driverKapat() {
        System.out.println("driverKapat");

    }


}
