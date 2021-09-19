package com.kelaniya.uni.V5.operation;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThrows;

public class DivOperationTest {

    @Test
    public void  should_divide_positive_values() {
        AddOperation addOperation = new AddOperation();
        double result = addOperation.execute(new double[]{5.0, 2.5});
        assertThat(result, is(2.0));
    }

    @Test
    public void  should_not_divide_by_zero() {
        AddOperation addOperation = new AddOperation();
        double result = addOperation.execute(new double[]{5.0, 0.0});
        assertThrows(InvalidOperationException.class);
    }


}