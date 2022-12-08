package com.junitest;


import com.junit.*;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TestAll {

    @Test
    public void Test1(){
        assertAll(
            ()-> assertEquals(10, Solution1.recurser(new int[]{1,2,3,4}, 0,0)),
            ()-> assertEquals(-3, Solution1.recurser(new int[]{-1,-1,-1}, 0,0)),
            ()-> assertEquals(1, Solution1.recurser(new int[]{1}, 0,0)),
            ()-> assertEquals(0, Solution1.recurser(new int[]{}, 0,0))
        );
    }
    @Test
    public void Test2(){
        assertAll(
            ()-> assertEquals(Arrays.deepToString(new int[][]{{3,3,3},{3,3,3},{3,3,3}}), Arrays.deepToString(Solution2.solution(3))),
            ()-> assertEquals(Arrays.deepToString(new int[][]{{2,2},{2,2}}), Arrays.deepToString(Solution2.solution(2)))
            //()-> assertEquals(Arrays.toString(new int[][]{{3,3,3},{3,3,3},{3,3,3}}), Arrays.toString(Solution2.solution(3)))
        );
    }
    @Test
    public void Test3(){
        assertAll(
            ()-> assertEquals("olleh", Solution3.recurser("hello", 5,"")),
            ()-> assertEquals("dlrow", Solution3.recurser("world", 5,""))
        );
    }
    /*@Test
    public void Test4(){
        assertAll(
            ()-> assertEquals(false, Solution4.validator("@google.com")),
            ()-> assertEquals(false, Solution4.validator("@google")),
            ()-> assertEquals(true, Solution4.validator("matt@google.com")),
            ()-> assertEquals(false, Solution4.validator("")),
            ()-> assertEquals(false, Solution4.validator("hello.gmail@com"))
        );
    }*/
    @Test
    public void Test5(){
        assertAll(
            ()-> assertEquals("68 65 6c 6c 6f 20 77 6f 72 6c 64" , Solution5.toHex("hello world")),
            ()-> assertEquals("42 69 67 20 42 6f 69" , Solution5.toHex("Big Boi")),
            ()-> assertEquals("4d 61 72 74 79 20 50 6f 70 70 69 6e 73 6f 6e" , Solution5.toHex("Marty Poppinson"))
        );
    }
    /*@Test
    public void Test6(){
        assertAll(
            ()-> assertEquals("HeLlO", Solution6.alternatingCaps("Hello")),
            ()-> assertEquals("HoW aRe YoU?", Solution6.alternatingCaps("How are you?")),
            ()-> assertEquals("OmG tHiS wEbSiTe Is AwEsOmE!", Solution6.alternatingCaps("OMG this website is awesome!"))
        );
    }
    @Test
    public void Test7(){
        assertAll(
            ()-> assertEquals("1 0", Solution7.removeDups("1 0 1 0")),
            ()-> assertEquals("The big cat", Solution7.removeDups("The big cat")),
            ()-> assertEquals("The big cat", Solution7.removeDups("The big cat"))

        );
    }*/
    @Test
    public void Test8(){
        assertAll(
            ()-> assertEquals(55, Solution8.fibo(10))
        );
    }
    /*@Test
    public void Test9(){
        assertAll(
            ()-> assertEquals(true, Solution9.isIsogram("Algorism")),
            ()-> assertEquals(true, Solution9.isIsogram("PasSword")),
            ()-> assertEquals(false, Solution9.isIsogram("Consecutive"))
            );
    }
    @Test
    public void Test10(){
        assertAll(
            ()-> assertEquals("ehllo", Solution10.sorter("Hello")),
            ()-> assertEquals("acehkr", Solution10.sorter(("hacker"))),
            ()-> assertEquals("eegk", Solution10.sorter(("geek"))),
            ()-> assertEquals("bcdeiiilrty", Solution10.sorter(("credibility")))
        );
    }
*/
}
