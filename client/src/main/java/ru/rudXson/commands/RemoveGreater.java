
package ru.rudXson.commands;

import ru.rudXson.base.InputManager;
import ru.rudXson.datatype.Flat;
import ru.rudXson.base.Client;
import ru.rudXson.requests.RemoveGreaterRequest;

import java.io.IOException;
import java.util.Scanner;

public class RemoveGreater implements Command {
    private final Scanner scanner;

    public RemoveGreater(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void execute(String[] args, Client client, boolean fromExecute, Scanner executeScanner) throws IOException {
        Scanner currScanner = scanner;
        if (fromExecute) currScanner = executeScanner;
        InputManager inManager = new InputManager(currScanner);
        Flat flat = new Flat();
        inManager.describeFlat(flat);


        client.sendRequestGetResponse(new RemoveGreaterRequest(flat));
        System.out.println("Elements removed successfully.");

    }

}

