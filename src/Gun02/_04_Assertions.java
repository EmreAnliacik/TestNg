package Gun02;


import org.testng.Assert;
import org.testng.annotations.Test;



public class _04_Assertions  {

    @Test
    public void equalsOrnek(){

        String s1 = "Merhaba";
        String s2 = "Merhaba";

        //Actul(Olusan), Expexcted(Beklenen), Mesaj(Opsiyonel)
        Assert.assertEquals(s1,s2,"Ayni degi");
        Assert.assertEquals(s1,s2); //Hata Messaji yazmak zorunda degiliz

    }

    @Test
    public void notEqualsOrnek(){
        String s1 = "Merhaba";
        String s2 = "Merhaba1";

        Assert.assertNotEquals(s1,s2,"Ayni");

    }


    @Test
    public void trueOrnek(){
        String s1 = "Merhaba";
        String s2 = "Merhaba";

        Assert.assertTrue(s1.equals(s2),"Ayni");

    }


    @Test
    public void nullOrnek(){
        String s1 = null;


        Assert.assertNull(s1,"Olusan Null degil");

    }

    @Test
    public void directFail(){
        int a1 = 55;

        if (a1 != 55) {
            Assert.fail();
        }

    }






}
