package com.iopo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        MySubstringStrTest.class,
        MySubstringIntParamTest.class,
        MySubstrOneStringParamTest.class,
        MySubstrBooleanParamTest.class
})

public class SuiteTests {
}
