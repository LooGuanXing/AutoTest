package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * @author LongNight
 * @date 2020-03-21 9:24 上午
 */
public class SuiteConfig {


    @BeforeSuite
    public void beforeSuite(){
        System.out.print("beforeSuite运行了！");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.print("afterSuite运行了！");
    }
}
