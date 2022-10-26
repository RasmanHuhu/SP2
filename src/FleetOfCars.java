import java.util.ArrayList;

public class FleetOfCars {

        ArrayList<Car> fleet = new ArrayList<Car>();

        public void addCar(Car car){
            fleet.add(car);
        }

    public int getTotalRegistrationFeeForFleet() {

        int sum = 0;

        for (Car c : fleet) {
            sum += c.getRegistrationFee();
        }
        return sum;

    }

    public int getTotal() {

        return fleet.size();

    }

    @Override
    public String toString() {
        return "Fleet of cars - " +
                "Fleet-size is a total of " + getTotal() + " cars." + "The total RF is " + getTotalRegistrationFeeForFleet() + " for the fleet.";
    }


}

