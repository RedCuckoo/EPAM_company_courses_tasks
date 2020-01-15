package org.company.tester;

import org.company.tester.annotations.Before;
import org.company.tester.annotations.Test;

public class MyTest {
   @Before
   public void before1(){
       System.out.println("before 1");
   }

    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void noTest(){
        System.out.println("no test");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }

}
