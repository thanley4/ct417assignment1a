import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ModuleTest
{
    Module module = new Module("Software Engineering 3", "CT417");
    Lecturer lecturer = new Lecturer("Michael", new LocalDate(1980, 1, 1));

    @Test
    public void testModule()
    {
        assertEquals(module.getName(), "Software Engineering 3");
        assertEquals(module.getCode(), "CT417");

        assertTrue(module.getStudents().isEmpty());
        assertTrue(module.getCourses().isEmpty());
        assertNull(module.getLecturer());

        module.setLecturer(lecturer);
        assertEquals(module.getLecturer(), lecturer);
    }
}
