package com.elevatorsystem.models.Button;

public abstract class Button {
    private bool status;

    private void pressButton() {
        this.status = true;
        System.out.println("Button pressed.");

    }
    private bool isPressed() {
        return this.status;
    }
}