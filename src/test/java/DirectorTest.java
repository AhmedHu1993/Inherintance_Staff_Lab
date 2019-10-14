import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Doola", 56789, 6000, "HR", 250000);
    }

    @Test
    public void testDirectorProperties(){
        assertEquals("Doola", director.getName());
        assertEquals(56789, director.getNiNum());
        assertEquals(6000, director.getSalary());
        assertEquals("HR", director.getDeptName());
        assertEquals(250000, director.getBudget(), 10);
    }

    @Test
    public void testRaiseDirectorSalary(){
        director.raiseSalary(260.5);
        assertEquals(6260.5, director.getSalary(), 0.5);
    }

    @Test
    public void testDirectorPayBonus(){
//        payBonus is 2%
        assertEquals(120, director.payBonus(), 0);
    }
}
