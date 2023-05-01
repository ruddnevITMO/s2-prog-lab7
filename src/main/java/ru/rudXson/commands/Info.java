package ru.rudXson.commands;

import ru.rudXson.base.CLIController;
import ru.rudXson.datatype.Flat;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Info implements Command{
    CLIController controller;

    public Info(CLIController controller) {
        this.controller = controller;
    }

    @Override
    public void execute(String[] args, boolean fromExecute, Scanner executeScanner) {
        PriorityQueue<Flat> flats = controller.getFlats();


        String result = "";
        result += "\tInformation about collection:\n";
        result += "Created at " + controller.getCreationDate() + '\n';
        result += "Collection type is " + flats.getClass().getSimpleName() + '\n';
        result += "Amount of items stored in - " + flats.size();

        System.out.println(result);
    }
    @Override
    public String getDescription(){
        return "Shows info about collection";
    }
}

