package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_DataProvider {
    @Test(dataProvider = "datalarim")
    public void Test(String searchText){
        System.out.println("searchText = " + searchText);





    }

    @DataProvider
    Object[] datalarim(){
        Object[] aranacaklar = {"mac","samsung","laptop"};
        return aranacaklar;
    }


    /*****************************************************************************/

    @Test(dataProvider ="datalar" )
    public void Test1(int data){
        System.out.println("data = " + data);
    }

    @DataProvider(name = "datalar")
    Object[] getData(){
        Object[] data={1,2,3,4,5};
        return data;
    }







}
        /*
verileri aktarırken
veya saklarken veya gönderirken
manalı ve ayrıştırılabilir
olması için veri şablonları
oluşturulmuştur.

        XML yapısı, bunun gibidir
        </>

json
veri gönderip almak içinde
{"isim","ismet"}
        {"soyad", "temur"}
            */
