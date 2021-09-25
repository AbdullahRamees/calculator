package com.kelaniya.uni.V5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class OperationFactoryTest {

    //test cases-what are you going test - logic  behind the code
      @test
        public void should_return_addOperation_object_when_operattor_is_add(){

            operationfactory operationFactory = new OperationFactory();
            Operation operation = operationFactory.getInstance("add");
            //verify that the operation object is an instance of addOperation class
            assertThat(operation, instanceOf(AddOperation.class));
        }
    //1.add pass -> return an objecy of add operation class
    @test
    public void should_return_subOperation_object_when_operattor_is_sub(){

        operationfactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("sub");
        //verify that the operation object is an instance of addOperation class
        assertThat(operation, instanceOf(SubOperation.class));
    }
    //2.sub pass -> return an object of suboperation calss
    //3.mul ->
    //4.div
}