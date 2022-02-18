package com.company.homework21;

import com.company.homework20.Test;

public class SimpleMathLibraryTest {

    @Test
    void testAddOperation(){
        if (SimpleMathLibrary.add(4,6) == 10 ){
            System.out.println("OK");
        } else{
            System.out.println("NOK");
        }
    }
    @Test
    void testMinusOperation(){
        if (SimpleMathLibrary.minus(6,2) == 4 ){
            System.out.println("OK");
        } else{
            System.out.println("NOK");
        }
    }

}
