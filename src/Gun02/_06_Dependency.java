package Gun02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _06_Dependency {
    //Arabanin hareket sirasi:start-drive-park-stop

//Eger testlerin calisma sirasini (priority=1) seklinde verirsek mesela ilk testte hata oldugunda yine de oburleri calisir sadece ilk test hata verir
    //ve bu durum istenen bir sey degildir.O yuzden testleri birbirine baglayarak siralama yapmaliyiz


    @Test
    public void startCar(){System.out.println("startCar");
        Assert.fail();
    }
    @Test(dependsOnMethods = {"startCar"})
    public void driveCar(){System.out.println("driveCar");}

    @Test(dependsOnMethods = {"driveCar"})
    public void parkCar(){System.out.println("parkCar");}
    @Test(dependsOnMethods = {"parkCar"},alwaysRun = true)  //Eger alwaysrun=true yazarsak yine sirasini bekler ama sirasi gelince digerlerinin fail verip vermedigine
    public void stopCar(){System.out.println("stopCar");}    //bakmaksizin her zaman calisir


    // aynı seviyedeki testleri için priority verilebilir.
}

// bağımlı testler, direk metodundan çalıştırdığınızda bağımlı olduğu metod zincirinde
// 1 üste kadar otomatik çağırıp çalışabilir.

//Dependency (bağımlılık):Bir testin diğer bir testin sonucuna veya
//belirli bir duruma bağlı olduğu durumları ifade eder.
//Örneğin, bir testin çalışabilmesi için önce başka bir testin başarılı
//bir şekilde tamamlanması gerekebilir. Bu tür senaryolarda TestNG'nin Dependency özelliği devreye girer.




}
