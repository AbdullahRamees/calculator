package com.kelaniya.uni.V5.operation;

public class AddOperation  implements Operation{

    public Double execute(double[] numbers) {
        return numbers[0] + numbers[1];
    }
}
