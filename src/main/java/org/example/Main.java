package org.example;

import org.example.arguments.exception.ValueNotFoundException;
import org.example.arguments.impl.FileArgument;
import org.example.commands.Command;
import org.example.commands.impl.SimpleCommand;
import org.example.operations.Operation;
import org.example.operations.impl.Capitalize;
import org.example.operations.impl.Reverse;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        String task = my.nextLine();

        System.out.println("Task: ");
        System.out.println(task);

        Command c = new SimpleCommand(task);

        c.addArgument("text", new FileArgument("./file.txt"));

        List<Operation> operations = List.of(
                new Reverse(),
                new Capitalize()
        );

        for (Operation op : operations) {
            if (op.canDo(c)) {
                try {
                    System.out.println(op.process(c).toString());
                } catch (ValueNotFoundException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
    }
}

