package org.example.arguments.impl;

import org.example.arguments.Argument;

public class SimpleArgument implements Argument {
    private final String value;

    public SimpleArgument(String value) {
        this.value = value;
    }

    @Override
    public String getAsString() {
        return value;
    }
}
