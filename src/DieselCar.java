// 5

public class DieselCar extends AFuelCar {

    protected boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);

        this.particleFilter = particleFilter;
    }

    @Override
    public String getFuelType() {

        return "Diesel";
    }


    public int getRegistrationFee() {
        if (KmPrLitre > 20) {
            if (!particleFilter) {
                return 130 + 1000;
            }
            return 130;
        }
        if (KmPrLitre > 15 && 20 > KmPrLitre) {
            if (!particleFilter) {
                return 1390 + 1000;
            }
            return 1390;
        }
        if (KmPrLitre > 10 && 15 > KmPrLitre) {
            if (!particleFilter) {
                return 1850 + 1000;
            }
            return 1850;
        }
        if (KmPrLitre > 5 && 10 > KmPrLitre) {
            if (!particleFilter) {
                return 2770 + 1000;
            }
            return 2770;
        } else {
            if (!particleFilter) {
                return 15260 + 1000;
            }
                    return 15260;
                }
            }
            public boolean hasParticleFilter () {
                return particleFilter;
            }


                @Override
                public String toString () {
                return "DieselCar - " +
                        "runs " + KmPrLitre + " per liter " + '\'' +
                        ", the registrationNumber is " + registrationNumber + '\'' +
                        ", the fueltype for this vehicle is " + getFuelType() + '\'' +
                        ", the make of the vehicle is " + make + '\'' +
                        ", the model is " + model + '\'' +
                        ", it has " + numberOfDoors + "doors in total" + '\'';
            }
        }