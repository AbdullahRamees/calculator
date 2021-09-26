package com.kelaniya.uni.V5.repository;

import java.io.IOException;

public class NumberRepositoryExeption extends Throwable {
    public NumberRepositoryExeption(Exception e, String message) {
        super(message,e);
    }
}
