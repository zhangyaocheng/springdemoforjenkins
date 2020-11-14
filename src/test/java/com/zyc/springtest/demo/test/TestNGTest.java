package com.zyc.springtest.demo.test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Epic("类似一级目录")
@Feature("类似二级目录")
public class TestNGTest {

    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass");
    }
    @Story("Story类似三级目录")
    @Test
    public void test1(){
        System.out.println("This is the first testng testcase in this springdemo");
        Assert.assertTrue(true);
    }
    @Story("Story类似三级目录")
    @Test
    public void test2(){
        System.out.println("The Second, it's true");
        Assert.assertTrue(true);
    }

    @Story("Story类似三级目录")
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
