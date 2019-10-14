import management.Director;
import management.Manager;
import org.junit.Test;
import staff.Employee;
import techStaff.DatabaseAdmin;
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
//        here payBonus is 2%
        assertEquals(190, employee.payBonus(),0);
    }

    @Test
    public void testDeveloperAsEmployee(){
        employee = new Developer("Ahmed", 123789, 1900);
        assertEquals("Ahmed", employee.getName());
        assertEquals(123789, employee.getNiNum());
        assertEquals(1900, employee.getSalary());
    }

    @Test
    public void testDbAdminRaiseOnlyPositiveNumbers(){
        employee = new DatabaseAdmin("Ahmed", 1237890, 2000);
        employee.raiseSalary(-450);
        assertEquals(2000, employee.getSalary());
    }

    @Test
    public void testDeveloperCanChangeNameAndNotNull(){
        employee = new Developer("Ahmed", 123, 1800);
        employee.setName(null);
        assertEquals("Ahmed", employee.getName());
        employee.setName("");
        assertEquals("Ahmed", employee.getName());
    }

}
