package com.cognizant;

import com.cognizant.Parking;
import org.junit.Test;
import org.junit.Assert;
public class ParkingTest {

    Parking p = new Parking();

    @Test
    public void registerCarAndCheckIfItExists(){
        //Expected
        boolean expected= true;
        //Actual
        Car c1 = new Car(123);
        p.registerCar(c1, true, 5);
        boolean actual = p.isRegistered(c1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changeParkingCarStatus(){
        //Expected
        boolean expected = false;
        //Actual
        Car c1 = new Car(123);
        p.registerCar(c1, true, 4);
        p.changePassStatus(c1, false);
        boolean actual = p.getPassStatus(c1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTimeTheCarIsParkedFor(){
        //Expected
        double expected = 4;
        //Actual
        Car c1 = new Car(123);
        p.registerCar(c1, false, 2);
        double actual = p.unParkCar(c1, 6);

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public testBillForMonthlyPass(){
        //Expected
        double expected = 0;
        //Actual
        Car c1 = new Car(123);
        p.registerCar(c1, true, 0);
        double actual = p.getTotalCharges(car);

        Assert.assertEquals(expected, actual, 0.1);
    }
}
