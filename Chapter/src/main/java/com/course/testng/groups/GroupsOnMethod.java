package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author LongNight
 * @date 2020-03-21 10:52 上午
 */
public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("服务端组测试方法11111！");

    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("服务端组测试方法22222！");

    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("客户端组测试方法11111！");

    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("客户端组测试方法22222！");

    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("服务端运行之前运行的方法");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("服务端运行之后运行的方法");
    }
}
