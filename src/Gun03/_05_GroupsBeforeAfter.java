package Gun03;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class _05_GroupsBeforeAfter {


    @Test(groups = {"Smoke Test"})
    public void test1(){System.out.println("test1");}


    @Test(groups = {"Regression"})
    public void test2(){System.out.println("test2");}


    @Test(groups = {"Smoke Test"})
    public void test3(){System.out.println("test3");}


    @Test(groups = {"Regression"})
    public void test4(){System.out.println("test4");}


    @Test(groups = {"Smoke Test"})
    public void test5(){System.out.println("test5");}


    @Test
    public void test6(){System.out.println("test6");}

    @BeforeGroups(groups = {"Regression"})
    public void bGroup(){
        System.out.println("Before Grouo");
    }

    @AfterGroups(groups = {"Regression"})
    public void aGroup(){
        System.out.println("After Group");
    }



}
