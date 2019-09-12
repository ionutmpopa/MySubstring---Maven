package com.iopo;

import org.junit.*;

public class MySubstringStrTest {

    public MySubstring mySubstring;

    @Before
    public void setUp() {
        mySubstring = new MySubstring();
    }


    @Test
    public void mySubstring_Test_Panama1_1() {

        String result = mySubstring.mySubstring("Panama", 1, 1);
        Assert.assertEquals("a", result);
    }

    @Test
    public void mySubstring_Test_Albuquerque1_2() {

        String result = mySubstring.mySubstring("Albuquerque", 1, 2);
        Assert.assertEquals("lb", result);
    }

    @Test
    public void mySubstring_Test_Panama1_3() {

        String result = mySubstring.mySubstring("Panama", 1, 3);
        Assert.assertEquals("ana", result);
    }

    @Test
    public void mySubstring_Test_Albuquerque1_4() {

        String result = mySubstring.mySubstring("Albuquerque", 1, 4);
        Assert.assertEquals("lbuq", result);
    }

    @Test
    public void mySubstring_Test_Panama1_5() {

        String result = mySubstring.mySubstring("Panama", 1, 5);
        Assert.assertEquals("anama", result);
    }

    @Test
    public void mySubstring_Test_Panama0_6() {

        String result = mySubstring.mySubstring("Panama", 0, 6);
        Assert.assertEquals("Panama", result);
    }

    @Test
    public void mySubstring_Test_Albuquerque2_1() {

        String result = mySubstring.mySubstring("Albuquerque", 2, 1);
        Assert.assertEquals("b", result);
    }

    @Test
    public void mySubstring_Test_Panama2_2() {

        String result = mySubstring.mySubstring("Panama", 2, 2);
        Assert.assertEquals("na", result);
    }

    @Test
    public void mySubstring_Test_Albuquerque2_3() {

        String result = mySubstring.mySubstring("Albuquerque", 2, 3);
        Assert.assertEquals("buq", result);
    }

    @Test
    public void mySubstring_Test_Panama2_4() {

        String result = mySubstring.mySubstring("Panama", 2, 4);
        Assert.assertEquals("nama", result);
    }

    @Test
    public void mySubstring_Test_Albuquerque2_5() {

        String result = mySubstring.mySubstring("Albuquerque", 2, 5);
        Assert.assertEquals("buque", result);
    }

    @Test
    public void mySubstring_Test_Panama3_1() {

        String result = mySubstring.mySubstring("Panama", 3, 1);
        Assert.assertEquals("a", result);
    }

    @Test
    public void mySubstring_Test_Albuquerque3_2() {

        String result = mySubstring.mySubstring("Albuquerque", 3, 2);
        Assert.assertEquals("uq", result);
    }

    @Test
    public void mySubstring_Test_Panama3_3() {

        String result = mySubstring.mySubstring("Panama", 3, 3);
        Assert.assertEquals("ama", result);
    }

    @Test
    public void mySubstring_Test_Australopithecus3_4() {

        String result = mySubstring.mySubstring("Australopithecus", 3, 4);
        Assert.assertEquals("tral", result);
    }


    @Test
    public void mySubstring_Test_Panama4_1() {

        String result = mySubstring.mySubstring("Panama", 4, 1);
        Assert.assertEquals("m", result);
    }

    @Test
    public void mySubstring_Test_Panama4_2() {

        String result = mySubstring.mySubstring("Panama", 4, 2);
        Assert.assertEquals("ma", result);
    }

    @Test
    public void mySubstring_Test_Albuquerque4_3() {

        String result = mySubstring.mySubstring("Albuquerque", 4, 3);
        Assert.assertEquals("que", result);
    }

    @Test
    public void mySubstring_Test_Panama5_1() {

        String result = mySubstring.mySubstring("Panama", 5, 1);
        Assert.assertEquals("a", result);
    }

    @Test
    public void mySubstring_Test_Panama_minus5_1() {

        String result = mySubstring.mySubstring("Panama", -5, 1);
        Assert.assertEquals("a", result);
    }

    @Test
    public void mySubstring_Test_Albuquerque10_1() {

        String result = mySubstring.mySubstring("Albuquerque", 10, 1);
        Assert.assertEquals("e", result);
    }

    @Test
    public void mySubstring_Test_Albuquerque_minus9_2() {

        String result = mySubstring.mySubstring("Albuquerque", -9, 2);
        Assert.assertEquals("bu", result);
    }

    @Test
    public void mySubstring_Test_Albuquerque_minus7_4() {

        String result = mySubstring.mySubstring("Albuquerque", -7, 4);
        Assert.assertEquals("quer", result);
    }









}