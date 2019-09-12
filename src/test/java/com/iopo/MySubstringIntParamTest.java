package com.iopo;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MySubstringIntParamTest {

    private MySubstring mySubstring;
    private Integer inputNumber;
    private Integer startsFrom;
    private Integer desiredLength;
    private Integer expectedResult;

    public MySubstringIntParamTest(Integer inputNumber, Integer startsFrom, Integer desiredLength, Integer expectedResult) {
        this.inputNumber = inputNumber;
        this.startsFrom = startsFrom;
        this.desiredLength = desiredLength;
        this.expectedResult = expectedResult;
    }

    @Before
    public void setUp() {
        mySubstring = new MySubstring();
    }

    @Parameterized.Parameters
    public static Collection substringParameters() {

        return Arrays.asList(new Object[][]{
                {123456, 0, 1, 1},
                {123456, 0, 3, 123},
                {123456, 1, 4, 2345},
                {123456, 1, 2, 23},
                {123456, 2, 4, 3456},
                {123456, 2, 1, 3},
                {123456, 2, 2, 34},
                {123456, 3, 3, 456},
                {123456, 3, 2, 45},
                {123456, 3, 1, 4},

        });
    }

    @Test
    public void mySubstring() {
        Integer result = mySubstring.mySubstring(inputNumber, startsFrom, desiredLength);
        Assert.assertEquals(expectedResult, result);
    }
}