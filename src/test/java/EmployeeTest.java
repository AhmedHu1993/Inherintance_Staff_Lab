import management.Director;
import management.Manager;
import org.junit.Test;
import staff.Employee;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Test
    public void testManagerAsEmployee(){
        employee = new Manager("Ahmed", 456789, 6500, "Backend");
        assertEquals("Backend", ((Manager) employee).getDeptName());
    }

    @Test
    public void testDirectorAsEmployee(){
        employee = new Director("Ahmed", 456789, 9500, "FrondEnd", 350000);
        assertEquals(350000,  ((Director) employee).getBudget() , 0);
        assertEquals(95, employee.payBonus(),0);
    }

    @Test
    public void testDeveloperAsEmployee(){
        employee = new Developer("Ahmed", 123789, 1900);
        assertEquals("Ahmed", employee.getName());
        assertEquals(123789, employee.getNiNum());
        assertEquals(1900, employee.getSalary());
    }

}
