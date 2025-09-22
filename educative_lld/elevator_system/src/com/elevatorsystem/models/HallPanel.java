package com.elevatorsystem.models;

import com.elevatorsystem.enums.Direction;
import com.elevatorsystem.models.Button.ElevatorButton;
import com.elevatorsystem.services.ElevatorSystem;
import java.util.List;

public class HallPanel {
    private HallButton up;
    private HallButton down;

    public HallPanel(HallButton up, HallButton down) {
        this.up = up;
        this.down = down;
    }
    public HallButton getUp() {
        return up;
    }
    public HallButton getDown() {
        return down;
    }
}