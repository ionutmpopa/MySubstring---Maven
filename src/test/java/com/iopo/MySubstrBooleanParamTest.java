package com.iopo;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MySubstrBooleanParamTest {

    private MySubstring substring;
    private String inputParameters;
    private String theSubstring;
    private String expectedResult;

    public MySubstrBooleanParamTest(String inputParameters, String theSubstring, String expectedResult) {
        this.inputParameters = inputParameters;
        this.theSubstring = theSubstring;
        this.expectedResult = expectedResult;
    }

    @Before
    public void setUp() {
        substring = new MySubstring();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testMyBooleanSub() {
        return Arrays.asList(new Object[][]{
                {"Graceland", "land", "Grace"},
                {"Introspect", "Int", "rospect"},
                {"Another way", "er w", "Anothay"},
                {"Another way", "An", "other way"},
                {"Australopithecus", "cus", "Australopithe"},
                {"Australopithecus", "pithecus", "Australo"},
                {"Australopithecus", "lopi", "Austrathecus"},
                {"Australopithecus", "lo", "Austrapithecus"},
                {"Australopithecus", "Austra", "lopithecus"},
                {"Australopithecus", "A", "ustralopithecus"}
        });
    }

    @Test
    public void whenAddedSubstringReturnRemaining() {
        String result = substring.mySubsequence(inputParameters, theSubstring);
        Assert.assertEquals(expectedResult, result);
    }

}
