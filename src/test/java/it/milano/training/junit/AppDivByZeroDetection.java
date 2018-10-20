package it.milano.training.junit;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;



import org.junit.Test;


public class AppDivByZeroDetection {

    private int numberA;
    private int numberB;
    

    // Inject via constructor
    // for {8, 2, 10}, numberA = 8, numberB = 2, expected = 10


    
    @Test
    public void testApp()
    {
    	numberA=1;
    	numberB=0;
    	try {
              AppMath.div(numberA, numberB);
                fail(); //remember this line, else 'may' false positive
            } catch (Exception e) {
               // System.out.println(e.toString());
                assertThat(e.getMessage(), is("/ by zero"));
    			//assert others
            }
        } 



}