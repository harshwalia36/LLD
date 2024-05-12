package main.java.com.harshwalia.model.parking.strategy;

import main.java.com.harshwalia.exception.NoFreeSlotAvailableException;
import java.util.TreeSet;

public class NaturalOrderingParkingStrategy implements ParkingStrategy{
    TreeSet<Integer> slotTreeSet;

    public NaturalOrderingParkingStrategy() {
        this.slotTreeSet = new TreeSet<>(); //Created a empty set
    }

    @Override
    public void addSlot(Integer slotNumber) {
        this.slotTreeSet.add(slotNumber);
    }

    @Override
    public void removeSlot(Integer slotNumber) {
        this.slotTreeSet.remove(slotNumber);
    }

    @Override
    public Integer getNextSlot() {
        return this.slotTreeSet.first();
    }
}
