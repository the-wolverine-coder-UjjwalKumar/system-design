package interface_segregation_principle.isp_fix;

import interface_segregation_principle.isp_violated.Car;

public class ParkCarManually implements ParkCar {
    @Override
    public void parkcar(Car car) {
        System.out.println("Parking car manually!!");
    }
}
