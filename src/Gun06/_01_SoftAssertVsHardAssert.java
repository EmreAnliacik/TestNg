package Gun06;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SoftAssertVsHardAssert {
    @Test
    public void hardAssert(){
        String s1 = "Merhaba";

        System.out.println("Assert Oncesi");
        Assert.assertEquals("Merhaba1234",s1, "Olusanla Beklenen ayni degil");  //fail
        System.out.println("Assrt sonrasi"); //Bu yaziyi yazmayacak cunlu assert eger fail se test kirilir yani fail verdigi anda test durur

    }

    @Test
    public void softAssert(){
        String a = "Merhaba";
        String a1 = "facebook";
        String a2 ="Hello";

        SoftAssert _softAssert = new SoftAssert();

        System.out.println("Assert Oncesi");

        _softAssert.assertEquals("Merhaba" , a); //pass
        System.out.println("Assert 1");

        _softAssert.assertEquals("google" ,a1 ); //fail
        System.out.println("Assert 2");

        _softAssert.assertEquals("Hello" ,a2); //pass
        System.out.println("Assert3");

        _softAssert.assertAll();

        System.out.println("Test Sonu word check");
        //bu bolum assert alldan sonra oldugu ve hata ciktigi icin gorunmeyecek






    }







}
