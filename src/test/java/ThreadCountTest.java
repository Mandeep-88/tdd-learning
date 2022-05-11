import org.testng.annotations.Test;

public class ThreadCountTest {
    @Test(threadPoolSize = 3,invocationCount = 5)
    public void Test1(){
        System.out.println("The thread value is :13");
    }
//    @Test
//    public void Test2(){
//        System.out.println("The thread value is :11");
//    }
//    @Test
//    public void Test3(){
//        System.out.println("The thread value is :10");
//    }
}
