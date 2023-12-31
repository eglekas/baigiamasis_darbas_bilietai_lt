package lt.egle.bilietai.tests;


import lt.egle.bilietai.utils.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;


@Listeners(TestListener.class)


public abstract class TestBase {
    @BeforeMethod
    public abstract void setUp() throws InterruptedException;

    @AfterMethod
    public void tearDown() {
//        Common.quitDriver();
    }


}
