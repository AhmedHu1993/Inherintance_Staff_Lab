import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Doola", 56789, 4000, "HR");
    }

    @Test
    public void testManagerProperties(){
        assertEquals("Doola", manager.getName());
        assertEquals(56789, manager.getNiNum());
        assertEquals(4000, manager.getSalary());
        assertEquals("HR", manager.getDeptName());
    }

    @Test
    public void testRaiseManagerSalary(){
        manager.raiseSalary(260.5);
        assertEquals(4260.5, manager.getSalary(), 0.5);
    }

    @Test
    public void testManagerPayBonus(){
        assertEquals(40, manager.payBonus(), 0);
    }

}
