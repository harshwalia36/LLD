package main.java.com.harshwalia.commands;

import  main.java.com.harshwalia.OutputPrinter;
import  main.java.com.harshwalia.model.Command;
import  main.java.com.harshwalia.service.ParkingLotService;

/**
 * Executor to handle command of exiting from the parking lot service. This is used in interactive
 * mode to exit.
 */
public class ExitCommandExecutor extends CommandExecutor {
  public static String COMMAND_NAME = "exit";

  public ExitCommandExecutor(
      final ParkingLotService parkingLotService, final OutputPrinter outputPrinter) {
    super(parkingLotService, outputPrinter);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean validate(final Command command) {
    return command.getParams().isEmpty();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void execute(final Command command) {
    outputPrinter.end();
  }
}
