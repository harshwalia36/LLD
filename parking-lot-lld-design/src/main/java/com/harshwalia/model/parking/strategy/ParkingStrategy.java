package main.java.com.harshwalia.model.parking.strategy;

public interface ParkingStrategy {

    public void addSlot(Integer slotNumber);

    public void removeSlot(Integer slotNumbInteger);

    // Get the next free slot as per the parking strategy
    public Integer getNextSlot();

} 
