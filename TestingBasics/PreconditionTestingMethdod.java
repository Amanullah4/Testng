package TestingBasics;

import org.jetbrains.annotations.TestOnly;
import org.testng.annotations.*;

public class PreconditionTestingMethdod {
        @BeforeClass
        public void beforeClass(){
            System.out.println("I am before class annotation");
        }
    @Test
    public void testMethod(){
        System.out.println("I am a test method");
    }
    @Test
    public void testMethod2(){
        System.out.println("I am a second test method");
    }
    @BeforeMethod
    public void beforMethod(){
        System.out.println("I am before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After annotation class");
    }
}
