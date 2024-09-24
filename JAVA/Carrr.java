public class Carrr {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    
    public Carrr start()
    {
        if (currentFuelInLiters == 0)
        {
            System.out.println("Cannot start");
        } else if (currentFuelInLiters < 5)
        {
            System.out.println("car is in reserved mode, please refuel");
        }
        else {
            System.out.println("Car started");
        }
        return this;
    }

    // Method to drive the car
    public void drive() {
        System.out.println("Car is driving");
        currentFuelInLiters--;
    }

    // Method to add fuel
    public void addFuel(float fuel) {
        this.currentFuelInLiters += fuel;
    }

    // Method to get the current fuel level
    public float getCurrentFuelLevel() {
        return currentFuelInLiters;
    }

    // Main method
    public static void main(String args[]) {
        //Carrr myCar = new Carrr();  // Create an instance of Carrr
        //myCar.drive();              // Call the drive method
        //myCar.addFuel(6);           // Add 6 liters of fuel
        //System.out.println(myCar.getCurrentFuelLevel()); // Print current fuel level
        Carrr bmw = new Carrr();
        bmw.addFuel(6);
        bmw.start();
        bmw.drive();

    }
}
