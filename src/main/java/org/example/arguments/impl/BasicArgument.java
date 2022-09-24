package org.example.arguments.impl;

import org.example.arguments.Argument;

public class BasicArgument implements Argument {
    private final String value;

    public BasicArgument(String value) {
        this.value = value;
    }

    @Override
    public String getAsString() {
        return value;
    }
}
