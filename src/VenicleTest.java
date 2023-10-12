import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;

    @Before
    public void setUp() {
        car = new Car("Toyota", "Camry", 2022);
    }

    @BeforeEach
    public void setUp2() {
        motorcycle = new Motorcycle("Honda", "CBR500R", 2021);
    }

    @Test
    void carIsInstanceOfVehicle() {
        // Arrange
        setUp();
        //Car car = new Car("Toyota", "Camry", 2022);
        // Act & Assert
        Assertions.assertTrue(car instanceof Vehicle);
    }

    @Test
    void carHasFourWheels() {
        // Arrange
        setUp();
        //Car car = new Car("Toyota", "Camry", 2022);
        // Act
        int numWheels = car.getNumWheels();
        // Assert
        Assertions.assertEquals(4, numWheels);
    }

    @Test
    void motorcycleHasTwoWheels() {
        // Arrange
        setUp2();
        //Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2021);
        // Act
        int numWheels = motorcycle.getNumWheels();
        // Assert
        Assertions.assertEquals(2, numWheels);
    }

    @Test
    void carCanTestDrive() {
        // Arrange
        setUp();
        // Car car = new Car("Toyota", "Camry", 2022);
        // Act
        car.testDrive();
        int speed = car.getSpeed();
        // Assert
        Assertions.assertEquals(60, speed);
    }

    @Test
    void motorcycleCanTestDrive() {
        // Arrange
        setUp2();
        // Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2021);
        // Act
        motorcycle.testDrive();
        int speed = motorcycle.getSpeed();
        // Assert
        Assertions.assertEquals(75, speed);
    }

    @Test
    void carCanPark() {
        // Arrange
        setUp();
        //Car car = new Car("Toyota", "Camry", 2022);
        // Act
        car.testDrive();
        car.park();
        int speed = car.getSpeed();
        // Assert
        Assertions.assertEquals(0, speed);
    }

    @Test
    void motorcycleCanPark() {
        // Arrange
        setUp2();
        // Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2021);
        // Act
        motorcycle.testDrive();
        motorcycle.park();
        int speed = motorcycle.getSpeed();
        // Assert
        Assertions.assertEquals(0, speed);
    }
}