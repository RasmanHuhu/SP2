public class GasolineCar extends AFuelCar {

    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    public String getFuelType() {

        return "Gasoline";
    }


    @Override
    public int getRegistrationFee() {
        if (KmPrLitre > 20) {
            return 330;
        }
        if (KmPrLitre > 15 && 20 > KmPrLitre) {
            return 1050;
        }
        if (KmPrLitre > 10 && 15 > KmPrLitre) {
            return 2340;
        }
        if (KmPrLitre > 5 && 10 > KmPrLitre) {
            return 5500;
        } else {
            return 10470;
        }
    }

    @Override
    public String toString() {
        return "GasolineCar - " +
                "runs " + KmPrLitre + " per liter " + '\'' +
                ", the registrationNumber is " + registrationNumber + '\'' +
                ", the fueltype for this vehicle is " + getFuelType() + '\'' +
                ", the make of the vehicle is " + make + '\'' +
                ", the model is '" + model + '\'' +
                ", it has " + numberOfDoors + "doors in total" + '\'';
    }
}