public class ElectricCar extends ACar {

    int batteryCapacity;

    int maxRange;

    int power;


    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange, int power) {
        super(registrationNumber, make, model, numberOfDoors);

        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
        this.power = power;
        //^ wh/km
    }

// returns the battery capacity in kilowatt hours
    //getMetoder - blot returnere!
    public int getBatteryCapacityKwh(){

        return batteryCapacity;
    }

//  returns the maximum range in kilometres.
    //getMetoder - blot returnere!
    public int getMaxRangeKm() {

        return maxRange;
   }

// returns the power consumption in watt hours per driven kilometre.
// An average electric car consumes approximately 0,20 kWh/km.
    //getMetoder - blot returnere!

    public int getWhPrKm() {

        return power;
    }

    public int getRegistrationFee() {
        //udregningen
        float kmPrL = (float) (power / 91.25 / 100);

        if (kmPrL > 20) {
            return 330;
        }
        if (kmPrL > 15 && 20 > kmPrL) {
            return 1050;
        }
        if (kmPrL > 10 && 15 > kmPrL) {
            return 2340;
        }
        if (kmPrL > 5 && 10 > kmPrL) {
            return 5500;
        } else {
            return 10470;
        }
    }

    @Override
    public String toString() {
        return "ElectricCar - " +
                "The battery capacity is " + batteryCapacity +
                ", max range of the vehicle is: " + maxRange +
                ", power of the vehicle is: " + power +
                ", registration number of this vehicle is " + registrationNumber + '\'' +
                ", the make of the vehicle is " + make + '\'' +
                ", the model of the behicle is " + model + '\'' +
                ", it has " + numberOfDoors + "doors in total" + '\'';
    }
}

