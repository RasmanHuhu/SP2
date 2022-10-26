public class Main {
    public static void main(String[] args) {

        Car xx = new GasolineCar("DS304000", "BMW", "Bussemand", 4, 17);
        Car yy = new DieselCar("DS504000", "Audi", "Arendt", 6, 14, false);
        Car zz = new ElectricCar("DS704000", "Ford", "Fyr", 8, 1000, 550, 2000);

        System.out.println(xx);
        System.out.println(yy);
        System.out.println(zz);


        FleetOfCars TotalFleet = new FleetOfCars();
        TotalFleet.addCar(xx);
        TotalFleet.addCar(yy);
        TotalFleet.addCar(zz);

        System.out.println(TotalFleet);
    }

}