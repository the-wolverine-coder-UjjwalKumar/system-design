package interface_segregation_principle.isp_fix;

import interface_segregation_principle.isp_violated.Car;

public interface UnparkCar {
    Car unparkCar(Car car);
}
