package com.zyc.springtest.demo.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGTest {

    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass");
    }

    @Test
    public void test1(){
        System.out.println("This is the first testng testcase in this springdemo");
        Assert.assertTrue(true);
    }

    @Test
    public void test2(){
        System.out.println("The Second, it's true");
        Assert.assertTrue(true);
    }

    @Test
    public void test3(){
        System.out.println("Flase");
        Assert.assertTrue(false);
    }

    @AfterClass
    public void EndClass(){
        System.out.println("EndClass");
    }

}
