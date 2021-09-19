package com.kelaniya.uni.V5.operation;

import java.awt.dnd.InvalidDnDOperationException;

public class DivOperation  implements Operation{

    public Double execute(Double[] numbers) throws InvalidOperationException {
        if (numbers[1] ==0){
            throw new InvalidOperationException("do not divide by 0");
        }
        return numbers[0] / numbers[1];
    }
}
