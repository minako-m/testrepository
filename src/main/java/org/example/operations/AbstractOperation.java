package org.example.operations;

import lombok.RequiredArgsConstructor;
import org.example.commands.Command;

import java.util.Objects;

@RequiredArgsConstructor
public abstract class AbstractOperation implements Operation {
    private final String name;

    public boolean canDo(Command c) {
        return (Objects.equals(c.getName(), name));
    }
}
