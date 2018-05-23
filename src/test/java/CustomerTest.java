import dealership.Customer;
import dealership.DealerShip;
import org.junit.Before;
import org.junit.Test;
import vehicle.*;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;
    SUV suv;
    Sedan sedan;
    Tyre tyre1, tyre2;
    VehicleComponent engine;
    DealerShip dealerShip;

    @Before
    public void before(){
        customer = new Customer(1000);
        tyre1 = new Tyre("Michellin", "abc", 15);
        tyre2 = new Tyre("Michellin", "abc", 15);
        engine = new Engine("Ford", "abc", 150);
        sedan = new Sedan(500, "Red", engine);
        suv = new SUV(500, "Red", engine);
        dealerShip = new DealerShip(10000);
        dealerShip.addCar(sedan);
        dealerShip.addCar(suv);
    }

    @Test
    public void hasWallet(){
        assertEquals(1000, customer.getWallet());
    }
    @Test
    public void hasOwnedCars(){
        assertEquals(0, customer.getOwnedCars().size());
    }
    @Test
    public void canSpendMoney(){
        customer.removeMoney(500);
        assertEquals(500, customer.getWallet());
    }
    @Test
    public void canEarnMoney(){
        customer.addMoney(500);
        assertEquals(1500, customer.getWallet());
    }


}
