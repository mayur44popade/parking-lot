package com.cognizant;

import java.util.Objects;

public class Car {

    int licensePlateNumber;
    boolean monthlyPassStatus;

    public Car(int number, boolean status){
        this.licensePlateNumber = number;
        this.monthlyPassStatus = status;
    }

    public int getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(int licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public boolean isMonthlyPassStatus() {
        return monthlyPassStatus;
    }

    public void setMonthlyPassStatus(boolean monthlyPassStatus) {
        this.monthlyPassStatus = monthlyPassStatus;
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
