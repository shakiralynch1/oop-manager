package dkit.sd2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest extends Employee {

    String name = "Bob";
    double hours = 40;
    double rate = 123.5;
    double bonus = 300.00;
    Manager manager=null;   // reference to Manager that can be accessed throughout this Manager test class

    @Before
    public void setUp() throws Exception {
        // Instantiate a Manager object for use in testing.
        // This method is called before the other tests to setUp objects

        manager = new Manager(name, hours, rate, bonus);
    }

    @Test
    public void managerConstructor() {
        // check Manager constructor argument values against retrieved field values.
        // delta is a tolerance I.e. values are equal if within 0.005 of each other
        Assert.assertEquals(name,manager.getName());
        Assert.assertEquals(hours,manager.getHours(),0.005);
        Assert.assertEquals(rate,manager.getRate(), 0.005);
        Assert.assertEquals(bonus,manager.getBonus(),0.005);
    }

    @Test
    public void testGetSalary() {
        double expectedSalary =  (hours * rate) + bonus;    // see setUp()
        double actualSalary = manager.getSalary();
        Assert.assertEquals(expectedSalary,actualSalary,0.005);
    }
}