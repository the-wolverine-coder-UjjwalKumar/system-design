package interface_segregation_principle.isp_fix;

import interface_segregation_principle.isp_violated.Car;

public class UnparkImpl implements UnparkCar {
    @Override
    public Car unparkCar(Car car) {
        System.out.println("Un-parked Car !!");
        return car;
    }
}
