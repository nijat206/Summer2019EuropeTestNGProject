package com.cybertek.tests.Day7_testng;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TestNGAssertionsDemo {
    @Test
    public void test1() {
        System.out.println("First Assertion");
        Assert.assertEquals("one", "one");

        System.out.println("Second Assertion");
        Assert.assertEquals(1, 1);
    }

    @Test
    public void test2() {

        String actualTitle = "Cybertek";
        String expactTitleBeginning = "C";
        System.out.println("First assertion");
        Assert.assertTrue(actualTitle.startsWith(expactTitleBeginning), "Verify title start with C");


    }

    @Test
    public void test3() {
        Assert.assertNotEquals("one","two","one should not equel to one");
    }

    @Test
    public void test4(){
        Assert.assertFalse(1<0);
    }


}
