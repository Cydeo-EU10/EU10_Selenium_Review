package week5;

import org.testng.*;
import org.testng.annotations.*;

public class TestNgPractice {


    @BeforeClass
    public static void init(){
        System.out.println("This is BEFORE CLASS");
    }

    @AfterClass
    public static void last(){
        System.out.println("This is AFTER CLASS");

    }

    @BeforeMethod
    public static void before(){
        System.out.println("this is BEFORE every method");
    }

    @AfterMethod
    public static void after(){
        System.out.println("this is AFTER    every method");

    }

    @Test
    public static void test1(){
        System.out.println("This is test 1");
    }

    @Test
    public static void test2(){
        System.out.println("This is test 2");
        System.out.println("This is test 2");
    }

    @Test
    public static void assertion(){
        Assert.assertEquals("home","house");
        Assert.assertTrue(true);

    }



}
