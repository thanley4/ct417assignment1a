import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CourseTest
{
    Course course = new Course("Electronic and Computer Engineering", new LocalDate(2019, 9, 5), new LocalDate(2024, 5, 31));

    @Test
    public void testCourse()
    {
        assertEquals(course.getName(), "Electronic and Computer Engineering");
        assertEquals(course.getStartDate(), new LocalDate(2019, 9, 5));
        assertEquals(course.getEndDate(), new LocalDate(2024, 5, 31));

        assertTrue(course.getModules().isEmpty());
        assertTrue(course.getStudents().isEmpty());
    }
}
