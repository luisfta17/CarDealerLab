import dealership.Customer;
import dealership.DealerShip;
import org.junit.Before;
import org.junit.Test;
import vehicle.*;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
    SUV suv;
    Sedan sedan;
    Tyre tyre1, tyre2;
    VehicleComponent engine;
    DealerShip dealerShip;
    Customer customer;

    @Before
    public void before(){
        customer = new Customer(1000);
        tyre1 = new Tyre("Michellin", "abc", 15);
        tyre2 = new Tyre("Michellin", "abc", 15);
        engine = new Engine("Ford", "abc", 150);
        sedan = new Sedan(500, "Red", engine);
        suv = new SUV(500, "Red", engine);
        dealerShip = new DealerShip(10000);

    }

    @Test
    public void hasMoney(){
        assertEquals(10000, dealerShip.getTill());
    }

    @Test
    public void hasGarage(){
        assertEquals(0, dealerShip.getGarage().size());
    }

    @Test
    public void canAddCarToGarage(){
        dealerShip.addCar(sedan);
        assertEquals(1, dealerShip.getGarage().size());
    }

    @Test
    public void canRemoveCarFromGarage(){
        dealerShip.addCar(sedan);
        dealerShip.addCar(suv);
        dealerShip.removeCar(sedan);
        assertEquals(1, dealerShip.getGarage().size());
    }

    @Test
    public void canMoveMoney(){
        dealerShip.removeMoney(5000);
        assertEquals(5000, dealerShip.getTill());
        dealerShip.addMoney(5000);
        assertEquals(10000, dealerShip.getTill());
    }

    @Test
    public void canSellCar(){
        dealerShip.addCar(sedan);
        dealerShip.addCar(suv);
        dealerShip.sellCar(sedan, customer);
        assertEquals(1, dealerShip.getGarage().size());
        assertEquals(10500, dealerShip.getTill());
    }

}
