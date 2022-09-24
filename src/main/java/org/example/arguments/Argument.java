package org.example.arguments;

import org.example.arguments.exception.ValueNotFoundException;

public interface Argument {
    String getAsString() throws ValueNotFoundException;
}
