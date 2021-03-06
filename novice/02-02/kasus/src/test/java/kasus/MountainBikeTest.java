/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package kasus;

import org.junit.Test;

import kasus.ClassesAndObject.MountainBike;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Ignore;

public class MountainBikeTest {

    private static MountainBike classUnderTest = new MountainBike(10, 20, 30, 40);
    
    @Test 
    public void testBicycleGetCadence() {
        
        assertEquals(20, classUnderTest.getCadence());
    }

    @Test
    public void testBicycleHasSpeed() {

        
        assertEquals(30, classUnderTest.getSpeed());
    }

    @Test
    public void testBicycleGetGear() {

        assertEquals(40, classUnderTest.getGear());
    }

    @Ignore
    public void testBicycleGetId() {

        assertEquals(2, classUnderTest.getID());
    }    
    
    @Ignore
    public void testBicycleGetNumberOfBicycle() {

        MountainBike b1 = new MountainBike(40, 3, 14, 545);
        MountainBike b2 = new MountainBike(40, 3, 14, 545);
        MountainBike b4 = new MountainBike(40, 3, 14, 545);
        assertEquals(8, classUnderTest.getNumberOfBicycles(), "it should show 4 because 1 object at the top and 3 object right here");
    }

    

    @Ignore
    public void testBicycleSpeedUp() {

        classUnderTest.speedUp(100);
        assertEquals(130, classUnderTest.getSpeed(), "the gear should return an integer value of 100");
    }

    @Ignore
    public void testBicycleApplyBrake() {

        classUnderTest.applyBrake(10);
        assertEquals(20, classUnderTest.getSpeed());
    }

}
