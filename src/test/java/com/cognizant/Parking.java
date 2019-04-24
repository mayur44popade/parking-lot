package com.cognizant;

import java.util.*;

public class Parking {

    private Set<Car> registeredCars = new HashSet<>();

    public void registerCar(Car car){
        registeredCars.add(car);
    }

    public boolean isRegistered(Car car){
        if(registeredCars.contains(car)){
            return true;
        }else{
            return false;
        }
    }
}
