package com.cybertek.tests.Day7_testng;

import org.testng.annotations.*;

public class BeforAndAfterTest {

    @Test
    public void test1(){
        System.out.println("This is my test one");
    }


    @Ignore
    @Test
    public void test2(){
        System.out.println("This is my second test");
    }


    @Test
    public void test3(){
        System.out.println("This is my three test");
    }


    @BeforeMethod
    public void BeforMethod(){
        System.out.println("Open Browser");
    }


    @AfterMethod
    public void AfterMethod(){
        System.out.println("Close Browser");
    }


    @BeforeClass
    public void beforClass(){
        System.out.println("Befor Close Code");
    }


    @AfterClass
    public void afterClass(){
        System.out.println("Afer Class Code");
        System.out.println("Reporting");
    }

}
