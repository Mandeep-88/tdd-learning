import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AutomationTest {
    static int i = 0;

    @Test(groups = {"sanity", "regression"}, enabled = false)
    public void tc1() {
        System.out.println("TC1");
    }

    //@Test(groups = {"sanity","smoke"},enabled = false,dependsOnGroups = {"regression"})
    @Test(priority = 10)
    public void tc2() {
        System.out.println("TC2");
    }

    //    @Test(groups = {"sanity"},dependsOnGroups = {"regression"})
    public void tc3() {
        System.out.println("TC3");
    }

    //    @Test(groups = {"smoke","regression"})
    @Test(priority = 8)
    public void tc4() {
        System.out.println("TC4");
    }

    //    @Test(groups = {"regression"})
    @Test(priority = 4)
    public void tc5() {
        System.out.println("TC5");
        Assert.fail();
    }
}

    //    @Test(groups = {"smoke"},dependsOnGroups = {"regression"})
//    @Test(timeOut = 1000)
//
//    public void tc6(){
//        try {
//            Thread.sleep(800);
//        }
//        catch( InterruptedException e){
//            e.printStackTrace();
//        }
//        System.out.println("TC6");
//    }
//}
//
//    @Test(dataProvider = "loginProvider", expectedExceptions = {RuntimeException.class,ArithmeticException.class},expectedExceptionsMessageRegExp = "by zero")
//    public void tc6(String username, String pass) {
//        int i = 2 / 0;
//
//        System.out.println("USER NAME " + username);
//        System.out.println("USER PASS " + pass);
//    }
//
//    @DataProvider
//    public Object[][] loginProvider() {
//        return new Object[][]{
//                {"mandeep", "463sfcsfv"},
//                {"Fateh", "5453vfsfsf"}
//        };
//
//
//    }
//}