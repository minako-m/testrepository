package org.example.arguments.impl;

import org.example.arguments.Argument;
import org.example.arguments.exception.ValueNotFoundException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileArgument implements Argument {
    private final String fileName;

    public FileArgument(String value) {
        this.fileName = value;
    }

    @Override
    public String getAsString() throws ValueNotFoundException {
        try {
            return new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            throw new ValueNotFoundException(String.format("Can not open file %s", fileName), e);
        }
    }
}
