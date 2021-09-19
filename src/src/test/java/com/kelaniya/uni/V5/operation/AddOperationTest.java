package com.kelaniya.uni.V5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class AddOperationTest {

        //cases
            // 5,6 =>11
            // 1,2 => 3
            // 0,0 => 0
            // -1,-2 => -3 .....................inbfinate number of cases

        //test cases
        //positive number + positive number => correct answer -> method 1
        //zero+zero = zero -> method 2
        // negative number+ negative number => correct answer
        //negative number + positive number => correct answer
    @Test
    public void  should_add_positive_values(){
        AddOperation addOperation= new AddOperation();
        double result = addOperation.execute(new double[] {5.0,6.0});
        assertThat(result, is(11.0));
    }

    @Test
    public void  should_add_zeros(){
        AddOperation addOperation= new AddOperation();
        Double result = addOperation.execute(new double[] {0.0,0.0});
        assertThat(result, is(0.0));
    }

    @Test
    public void  should_add_negative_velues(){
        AddOperation addOperation= new AddOperation();
        Double result = addOperation.execute(new double[] {-1.0,-0.5});
        assertThat(result, is(-1.5));
    }
}
//what is the responsibility for addOperation class
//figure out test cases
