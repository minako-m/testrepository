package org.example.commands.impl;

import lombok.EqualsAndHashCode;
import org.example.arguments.exception.ValueNotFoundException;
import org.example.commands.AbstractCommand;
import org.example.arguments.Argument;
import org.example.commands.Command;

import java.util.HashMap;
import java.util.Map;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public class SimpleCommand extends AbstractCommand implements Command {
    protected final Map<String, Argument> arguments = new HashMap<>();

    public SimpleCommand(String name) {
        super(name);
    }

    public void addArgument(String name, Argument arg) {
        arguments.put(name, arg);
    }

    public String getAttributeAsString(String name) throws ValueNotFoundException {
        return arguments.get(name).getAsString();
    }

    @Override
    public boolean containsAttribute(String name) {
        return arguments.containsKey(name);
    }

    @Override
    public int numberOfAttributes() {
        return arguments.size();
    }
}
