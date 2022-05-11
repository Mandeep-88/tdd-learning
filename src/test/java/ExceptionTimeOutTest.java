import org.testng.Assert;
import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
//    @Test(timeOut = 200)
//    public void infiniteLoop(){
//        int i=1;
//        while(i==1){
//            System.out.println(i);
//        }
//    }
    @Test(expectedExceptions = NumberFormatException.class)
    public void testException(){
//        int i= 9/0;                 //-----Arithmetic Exception
//        System.out.println(i);
        String x="100A";             //------Number Format Exception
        Integer.parseInt(x);

    }
}
