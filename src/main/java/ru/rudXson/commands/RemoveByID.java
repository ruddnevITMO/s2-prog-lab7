package ru.rudXson.commands;

import ru.rudXson.base.CLIController;

import java.util.UUID;

public class RemoveByID implements Command {
    CLIController c;

    public RemoveByID(CLIController c) {
        this.c = c;
    }

    @Override
    public String getDescription() {
        return "Remove element with ID specified";
    }

    @Override
    public void execute(String[] args) {
        c.getFlats().remove(c.getFlatByID(UUID.fromString(args[1])));
    }
}