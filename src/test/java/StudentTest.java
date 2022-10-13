import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest
{
    Student student = new Student("Timothy", new LocalDate(2000, 12, 31), 19417576);

    @Test
    public void testStudent()
    {
        assertTrue(student.getCourses().isEmpty());
        assertTrue(student.getModules().isEmpty());
        assertEquals(student.getName(), "Timothy");
        assertEquals(student.getDateOfBirth(), new LocalDate(2000, 12, 31));
        assertEquals(student.getAge(), 21);
        assertEquals(student.getId(), 19417576);
        assertEquals(student.getUsername(), "Timothy21");
        System.out.println("\nStudent Object Instantiation Successful");
    }
}
