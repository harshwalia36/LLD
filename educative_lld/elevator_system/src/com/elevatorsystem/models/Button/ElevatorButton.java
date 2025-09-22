package com.elevatorsystem.models.Button;

import java.util.List;

public ElevatorButton extends Button {
    private int destinationFloorNumber;

    public ElevatorButton(int destinationFloorNumber) {
        this.floorNumber = destinationFloorNumber;
    }

    public int getFloorNumber() {
        return destinationFloorNumber;
    }

    @Override
    public void pressButton() {
        super.pressButton();
        System.out.println("Elevator button pressed for floor " + destinationFloorNumber);
    }
}