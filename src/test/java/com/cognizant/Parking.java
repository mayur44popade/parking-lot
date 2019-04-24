package com.cognizant;

import java.util.*;

public class Parking {

    private Map<Car, Boolean> registeredCars = new HashMap<>();

    public void registerCar(Car car, boolean monthlyPassStatus){
        registeredCars.put(car, monthlyPassStatus);
    }

    public boolean isRegistered(Car car){
        if(registeredCars.containsKey(car)){
            return true;
        }else{
            return false;
        }
    }

    public void changePassStatus(Car car, boolean status){
        registeredCars.put(car, status);
    }

    public boolean getPassStatus(Car car){
        return registeredCars.get(car);
    }
}
