package com.elevatorsystem.models.Button;

import com.elevatorsystem.enums.Direction;

public class HallButton extends Button {
    private int floorNumber;
    private Direction direction;

    public HallButton(int floorNumber, Direction direction) {
        this.floorNumber = floorNumber;
        this.direction = direction;
    }
    public int getFloorNumber() {
        return floorNumber;
    }
    public Direction getDirection() {
        return direction;
    }
    @Override
    public void pressButton() {
        super.pressButton();
        System.out.println("Hall button pressed for floor " + floorNumber + " in direction " + direction);
    }
}