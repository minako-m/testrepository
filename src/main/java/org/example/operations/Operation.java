package org.example.operations;

import org.example.arguments.exception.ValueNotFoundException;
import org.example.commands.Command;
import org.example.commands.impl.SimpleCommand;

public interface Operation {
    boolean canDo(Command c);
    boolean validate(Command c);
    Result process(Command c) throws ValueNotFoundException;
}
