package Gun01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class _02_Annotations {

    @BeforeClass //class in icindekilerden once calisir
    public void baslangicIslemleri(){
        System.out.println("Baslangic Islmeleri");
    }

    @Test //Anootation : metodun turunu ve calisma ozelliklerini belirler
    public void Test1(){  //Test1 : Test metodunun adi
        System.out.println("Test1 Calisti");
    }

    @Test //Anootation : metodun turunu ve calisma ozelliklerini belirler
    public void Test2(){  //Test1 : Test metodunun adi
        System.out.println("Test2 Calisti");
    }

    @AfterClass //class in icindekilerden sonra calisir
    public void bitisIslemleri(){
        System.out.println("Bitis ISLEMLERI");
    }





}
