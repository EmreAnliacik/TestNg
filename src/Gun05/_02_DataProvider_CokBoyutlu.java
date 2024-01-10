package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProvider_CokBoyutlu {
    @Test(dataProvider = "UserData")
    public void userTest(String username , String password){
        System.out.println(username+" "+password);

    }

    @DataProvider
    Object[][] UserData(){
        Object[][] data = {
                {"Ali", "1234"},
                {"veli", "sifrembenim"}
        };

        return data;
    }








}
