package com.iopo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MySubstrOneStringParamTest {

    private MySubstring substring;
    private String inputParameter;
    private int startingFrom;
    private String expectedResult;

    public MySubstrOneStringParamTest(String inputParameter, int startingFrom, String expectedResult) {
        this.inputParameter = inputParameter;
        this.startingFrom = startingFrom;
        this.expectedResult = expectedResult;
    }

    @Before
    public void setUp() {
        substring = new MySubstring();
    }

    @Parameterized.Parameters
    public static Collection substrParameters() {

        return Arrays.asList(new Object[][] {
                {"Grecus", 3, "cus"},
                {"Indulge", 2, "dulge"},
                {"Atomicity", 1, "tomicity"},
                {"Australopithecus", 6, "lopithecus"},
                {"Graceland", 5, "land"},
                {"Australopithecus", 0, "Australopithecus"},
                {"Australopithecus", 1, "ustralopithecus"},
                {"Australopithecus", 2, "stralopithecus"},
                {"Australopithecus", 3, "tralopithecus"},
                {"Australopithecus", 4, "ralopithecus"},
                {"Australopithecus", 5, "alopithecus"},
                {"Australopithecus", 6, "lopithecus"},

        });
    }

    @Test
    public void testMethodWithParameterized() {

        String result = substring.mySubstring(inputParameter, startingFrom);
        Assert.assertEquals(expectedResult, result);

    }

}
