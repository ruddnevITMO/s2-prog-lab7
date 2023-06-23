package ru.rudXson.commands;

import ru.rudXson.base.Client;
import ru.rudXson.requests.HelpRequest;
import ru.rudXson.responses.HelpResponse;

import java.io.IOException;
import java.util.Scanner;

public class Help implements Command{
    @Override
    public void execute(String[] args, Client client, boolean fromExecute, Scanner executeScanner) throws IOException {
        HelpResponse response = (HelpResponse) client.sendRequestGetResponse(new HelpRequest());
        System.out.printf("%-35s   %-90s %n", "COMMAND", "DESCRIPTION");
        System.out.printf("--------------------------------------------------------------------------%n");
        for (String command:response.descriptions.keySet()){
            System.out.printf("%-35s   %-90s %n", command, response.descriptions.get(command));
        }
        System.out.printf("%-35s   %-90s %n", "execute_script", "Executes a script from a file");
    }
}
