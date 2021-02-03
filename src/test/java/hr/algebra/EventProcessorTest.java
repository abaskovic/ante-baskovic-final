package hr.algebra;

import com.sun.javaws.IconUtil;
import hr.algebra.DAL.VehicleFactory;
import hr.algebra.models.Car;
import hr.algebra.models.Truck;
import hr.algebra.models.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EventProcessorTest {

    @Test
    public void shouldReturnTrueIfTankIsEmpty(){

        Vehicle vehicle = new Vehicle(1,"ma-365ba",9.00);


        Assertions.assertTrue(vehicle.isEmpty());

    }

    @Test
    public void shouldReturnFalseIfTankIsNotEmpty(){

        Vehicle vehicle = new Vehicle(1,"ma-365ba",50.00);
        Assertions.assertFalse(vehicle.isEmpty());

    }


    @Test
    public void shouldReturn50ForCarCharge(){

        Car car = new Car(1,"ma-663-ds",30.0);
        double charge= car.calculateCharge();

        Assertions.assertEquals(50.00, charge);

    }

    @Test
    public void shouldReturn90ForTruckCharge(){
        Truck   truck  = new Truck(1,"ma-663-ds",30.0);
        double charge= truck.calculateCharge();
        Assertions.assertEquals(90.00, charge);

    }


    @Test
    public void shouldCreateCarInVehicleFactory(){

        Vehicle vehicle = VehicleFactory.createVehicle("car",1,"ma-365ba",50.00);

        Assertions.assertEquals("Car", vehicle.getClass().getSimpleName());

    }

    @Test
    public void shouldCreateTruckInVehicleFactory(){

        Vehicle vehicle = VehicleFactory.createVehicle("TRUCK",1,"ma-365ba",50.00);

        Assertions.assertEquals("Truck", vehicle.getClass().getSimpleName());

    }



}
