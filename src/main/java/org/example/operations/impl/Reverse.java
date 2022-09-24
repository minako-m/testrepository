package org.example.operations.impl;

import org.example.arguments.exception.ValueNotFoundException;
import org.example.commands.Command;
import org.example.operations.AbstractOperation;
import org.example.operations.Result;

public class Reverse extends AbstractOperation {
    public Reverse() {
        super("rev");
    }

    @Override
    public boolean validate(Command c) {
        return c.numberOfAttributes() == 1;
    }

    @Override
    public Result process(Command c) throws ValueNotFoundException {
        String arg = c.getAttributeAsString("text");
        return new Result(
                new StringBuilder(arg)
                        .reverse()
                        .toString());
    }
}
