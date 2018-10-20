package it.milano.training.junit;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	
	AppAddTestParam.class,
	AppDivByZeroDetection.class
    //Exception1Test.class, //test case 1
    //TimeoutTest.class     //test case 2
})

/**
 * Unit test for simple App.
 */
public class AppTestSuite {}
