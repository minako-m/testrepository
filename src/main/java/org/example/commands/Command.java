package org.example.commands;

import org.example.arguments.Argument;
import org.example.arguments.exception.ValueNotFoundException;

public interface Command {
    String getName();
    String getAttributeAsString(String name) throws ValueNotFoundException;
    boolean containsAttribute(String name);
    int numberOfAttributes();
    void addArgument(String name, Argument arg);
}
