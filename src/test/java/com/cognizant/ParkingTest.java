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
        p.registerCar(c1, true);
        boolean actual = p.isRegistered(c1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changeParkingCarStatus(){
        //Expected
        boolean expected = false;
        //Actual
        Car c1 = new Car(123);
        p.registerCar(c1, true);
        p.changePassStatus(c1, false);
        boolean actual = p.getPassStatus(c1);

        Assert.assertEquals(expected, actual);
    }
}
