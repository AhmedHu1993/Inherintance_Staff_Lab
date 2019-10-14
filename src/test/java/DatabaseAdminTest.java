import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin dbAdmin;

    @Before
    public void before(){
        dbAdmin = new DatabaseAdmin("Ahmed", 123789, 1900);
    }

    @Test
    public void testDbAdminProperties(){
        assertEquals("Ahmed", dbAdmin.getName());
        assertEquals(123789, dbAdmin.getNiNum());
        assertEquals(1900, dbAdmin.getSalary());
    }

    @Test
    public void testDbAdminRaiseSalary(){
        dbAdmin.raiseSalary(150);
        assertEquals(2050, dbAdmin.getSalary());
    }

    @Test
    public void testDbAdminPayBonus(){
        assertEquals(19, dbAdmin.payBonus(), 0);
    }
}
