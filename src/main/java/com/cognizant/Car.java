package com.cognizant;

import java.util.Objects;

public class Car {

    int licensePlateNumber;

    public Car(int number){
        this.licensePlateNumber = number;
    }

    public int getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(int licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getLicensePlateNumber() == car.getLicensePlateNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLicensePlateNumber());
    }
}
