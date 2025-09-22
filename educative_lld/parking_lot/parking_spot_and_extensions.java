// Parking Spot Abstract class

public abstract class ParkingSpot{
    private int id;
    private bool isFree;
    private Vehicle vehicle;
    
    public boolen isGetFree() {
        return isFree;
    }
    public boolean assignVehicle(Vehicle vehicle) {
        if (isFree) {
            this.vehicle = vehicle;
            isFree = false;
            return true;
        }
        return false;
    }
    public boolean removeVehicle() {
        if (!isFree) {
            this.vehicle = null;
            isFree = true;
            return true;
        }
        return false;
    }
}

public class Large extends ParkingSpot {
    
}

public class Compact extends ParkingSpot {
    
}
public class Motorcycle extends ParkingSpot {
    
}
public class Handicapped extends ParkingSpot {
    
}