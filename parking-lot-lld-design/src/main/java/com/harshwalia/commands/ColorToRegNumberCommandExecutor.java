package main.java.com.harshwalia.commands;

import main.java.com.harshwalia.OutputPrinter;
import main.java.com.harshwalia.model.Command;
import main.java.com.harshwalia.model.Slot;
import main.java.com.harshwalia.service.ParkingLotService;
import java.util.List;
import java.util.stream.Collectors;

public class ColorToRegNumberCommandExecutor extends CommandExecutor {
    public static String COMMAND_NAME = "registeration_number_for_cars_with_colour";

    public ColorToRegNumberCommandExecutor(final ParkingLotService parkingLotService,
            final OutputPrinter outputPrinter) {
        super(parkingLotService, outputPrinter);
    }

    @Override
    public boolean validate(final Command command) {
        return command.getParams().size() == 1;
    }

    @Override
    public void execute(final Command command) {
        final List<Slot> slotsForColor = parkingLotService.getSlotsForColor(command.getParams().get(0));
        if (slotsForColor.isEmpty()) {
            outputPrinter.notFound();
        } else {
            final String result = slotsForColor.stream()
                    .map(slot -> slot.getParkedCar().getRegistrationNumber())
                    .collect(Collectors.joining(", "));
            outputPrinter.printWithNewLine(result);
        }
    }

}
