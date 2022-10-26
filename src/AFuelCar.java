// 3.

public abstract class AFuelCar extends ACar {

    int KmPrLitre;
    String fuelType;

    /*String gasoline;
    String diesel; */

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int getKmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);

        this.KmPrLitre = getKmPrLitre;

    }

    // should return “Gasoline” or “Diesel”
    public abstract String getFuelType();


    // should return how many kilometres the car can drive on 1 litre of fuel
    public int getKmPrLitre() {

        return KmPrLitre;

        }

    @Override
    public String toString() {
        return "AFuelCar - " +
                "runs " + KmPrLitre + " per liter" + '\'' +
                ", the registrationNumber is '" + registrationNumber + '\'' +
                ", the fueltype for this vehicle is '" + getFuelType() + '\'' +
                ", the make of the vehicle is '" + make + '\'' +
                ", the model is '" + model + '\'' +
                ", it has " + numberOfDoors + "doors in total" + '\'';
    }
}

