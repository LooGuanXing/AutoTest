package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author LongNight
 * @date 2020-03-21 10:39 上午
 */
public class IgnoreTest {

    @Test
    public void ignore1(){
        System.out.println("ignore1 执行");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 执行");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3 执行");
    }





}
