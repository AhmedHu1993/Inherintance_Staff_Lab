import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Ahmed", 2345678, 1800);
    }

    @Test
    public void testDeveloperParameters(){
        assertEquals("Ahmed", developer.getName());
        assertEquals(2345678, developer.getNiNum());
        assertEquals(1800, developer.getSalary());
    }

    @Test
    public void testDeveloperRaiseSalary(){
        developer.raiseSalary(300);
        assertEquals(2100, developer.getSalary());
    }

    @Test
    public void testDeveloperPayBonus(){
        assertEquals(18, developer.payBonus(), 0);
    }
}
