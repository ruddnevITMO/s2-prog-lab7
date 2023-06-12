package ru.rudXson.base;

import ru.rudXson.commands.*;

import java.util.HashMap;

/**
 * This class represents a command executor that is used to execute different commands
 */
public class CommandExecutor {
    HashMap<String, Command> commands = new HashMap<>();

    SQLController controller;

    /**
     * Constructs a new instance of the CommandExecutor
     * @param controller the command line interface controller to be used to execute the commands
     */
    public CommandExecutor(SQLController controller) {
        this.controller = controller;
        commands.put("login", new Login(controller));
        commands.put("register", new Register(controller));
        commands.put("help", new Help(commands));
        commands.put("show", new Show(controller));
        commands.put("add", new Add(controller));
        commands.put("update", new Update(controller));
        commands.put("remove_by_id", new RemoveByID(controller));
        commands.put("remove_first", new RemoveFirst(controller));
        commands.put("add_if_min", new AddIfMin(controller));
        commands.put("print_descending", new PrintDescending(controller));
        commands.put("info", new Info(controller));
        commands.put("clear", new Clear(controller));
        commands.put("print_unique_house", new PrintUniqueHouse(controller));
        commands.put("exit", new Exit());
        commands.put("remove_greater", new RemoveGreater(controller));
        commands.put("print_field_descending_transport", new PrintFieldDescendingTransport(controller));
    }


    /**
     * Returns the command object for the given command name
     * @param commandName the name of the command to get
     * @return the command object for the given command name
     */
    public Command getCommand(String commandName) {
        if(!commands.containsKey(commandName)) return null; // check if command exist
        return commands.get(commandName);
    }
}
