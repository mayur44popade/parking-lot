package com.cognizant;

import org.junit.Test;
import org.junit.Assert;
public class ParkingTest {

    public void setUp(){
        Parking p = new Parking();
    }

    @Test
    public void registerCarAndCheckIfItExists(){
        //Expected
        Car c1 = new Car(123, 0);
        p.registerCar();
        boolean expected = p.isRegistered();

        boolean actual = true;

        Assert.assertEquals(expected, actual);
    }
}
