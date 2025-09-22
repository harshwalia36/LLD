package com.elevatorsystem.models;

import com.elevatorsystem.models.Button.ElevatorButton;
import com.elevatorsystem.services.ElevatorSystem;
import java.util.List;

public class ElevatorPanel {
    private final List<ElevatorButton> floorButtons;  // List of buttons for each floor
    private ElevatorButton open;
    private ElevatorButton close;

    public ElevatorPanel(int max_floor) {
        this.floorButtons = new ArrayList<>();
        for (int i = ElevatorSystem.MIN_FLOOR; i < max_floor; i++) {
            this.floorButtons.add(new ElevatorButton(i));
        }
        this.open = new ElevatorButton(-1); // Special button for opening the door
        this.close = new ElevatorButton(-2); // Special button for closing the door
    }

}