package org.example.operations.impl;

import org.example.arguments.exception.ValueNotFoundException;
import org.example.commands.Command;
import org.example.operations.AbstractOperation;
import org.example.operations.Result;

public class Capitalize extends AbstractOperation {
    public Capitalize() {
        super("cap");
    }

    @Override
    public boolean validate(Command c) {
        return c.numberOfAttributes() == 1;
    }

    @Override
    public Result process(Command c) throws ValueNotFoundException {
        return new Result(c.getAttributeAsString("text").toUpperCase());
    }
}
