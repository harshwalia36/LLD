package com.elevatorsystem.models;

import com.elevatorsystem.enums.Direction;


public class Display {
    private int currentFloor;
    private int capacity;
    private Direction direction;

    public Display(int currentFloor,int capacity, Direction direction) {
        this.currentFloor = currentFloor;
        this.capacity = capacity;
        this.direction = direction;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
     /**
     * Shows the current state on an elevator's display.
     */
    public void showElevatorDisplay() {
        System.out.println("Elevator Display: F" + currentFloor + " | Psg: " + currentCapacity + "/" + maxCapacity + " | Dir: " + currentDirection.name());
    }

    /**
     * Shows the current state on a hall display (usually just floor and elevator direction/status).
     */
    public void showHallDisplay() {
        System.out.println("Hall Display F" + currentFloor + ": Elevator " + currentDirection.name() + " at " + currentFloor);
    }
    
}