import org.testng.annotations.*;

public class DummyTest {
    @BeforeSuite
    @Parameters({"url"})
    public void setupOnSuite(String url)
    {
        System.out.println("Setting up on suite level");
        System.out.println("URL i got "+ url);
    }
    @BeforeTest
    @Parameters({"url"})
    public void testLevelSetup(String url)
    {
        System.out.println("Setting up on test level");
        System.out.println("URL i got "+ url);
    }

    @Test
    @Parameters("url")

        public void dummyTestCase(String url)
    {
        System.out.println("Setting up on class level");
    System.out.println("Dummy Tc" + url);
}
    @AfterSuite
    public void teardownOnSuite(){
        System.out.println("Tearing down on Suite Level");
    }
//    @AfterTest
//    public void teardownOnTest(){
//        System.out.println("Tearing down on Test Level");
//    }
}

