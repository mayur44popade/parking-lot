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
        Car c1 = new Car(123, true);
        p.registerCar(c1);
        boolean actual = p.isRegistered(c1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changeParkingCarStatus(){
        //Expected
        boolean monthlyPass = false;
        
    }
}
