import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LecturerTest
{
    Lecturer lecturer = new Lecturer("Michael", new LocalDate(1980, 1, 1));

    @Test
    public void testLecturer()
    {
        assertEquals(lecturer.getUsername(), "Michael42");
        assertEquals(lecturer.getName(), "Michael");
        assertEquals(lecturer.getDateOfBirth(), new LocalDate(1980, 1, 1));
        assertEquals(lecturer.getAge(), 42);

        assertTrue(lecturer.getModules().isEmpty());
    }
}
