package interface_segregation_principle.isp_violated;

public class ParkCarImpl implements ParkingLot {
    // Here classes has to implemented all those methods which are not relevant for this class
    @Override
    public void parkCar() {
        System.out.println("Parking car and this method is only of my use, rest are useless for me");
    }

    @Override
    public void unparkCar() {
    }

    @Override
    public void getCapacity() {
    }

    @Override
    public double calculateFee(Car car) {
        return 0;
    }

    @Override
    public void doPayment(Car car) {
    }
}
