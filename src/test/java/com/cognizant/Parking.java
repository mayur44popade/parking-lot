package com.cognizant;

import java.util.*;

public class Parking {

    private Map<Car, Boolean> registeredCars = new HashMap<>();
    private Map<Car, Double> parkedCars = new HashMap<>();

    public void registerCar(Car car, boolean monthlyPassStatus, double inTime){
        if(monthlyPassStatus == true){
            registeredCars.put(car, monthlyPassStatus);
        }else{
            parkedCars.put(car, inTime);
        }
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

    //This method returns the number of hours the car is parked
    public double unParkCar(Car car, double outTime){
        return outTime - parkedCars.get(car);
    }
}
