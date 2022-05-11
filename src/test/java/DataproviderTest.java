import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTest {
    @Test
    public void tc1(){
        System.out.println("TC1");
    }
    @Test(dataProvider = "loginProvider")
    public void tc2(String username, String pwd){
        System.out.println("USERNAME "+username);
        System.out.println("USER PWD "+ pwd);

    }
    @DataProvider
    public Object[][] loginProvider(){
        return new Object[][]{
                {"Mandeep","zxczxfcz64"},
                {"Anhad","dcxfasdf46"},
        };
    }
}
