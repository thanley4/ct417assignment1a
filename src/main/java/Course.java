import java.util.ArrayList;
import java.util.List;
import org.joda.time.*;

public class Course
{
    private final String name;
    private final List<Module> modules;
    private final List<Student> students;
    private final LocalDate startDate;
    private final LocalDate endDate;

    public Course(String name, LocalDate startDate, LocalDate endDate)
    {
        this.name = name;
        this.modules = new ArrayList<>();
        this.students = new ArrayList<>();
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public List<Module> getModules()
    {
        return modules;
    }

    public List<Student> getStudents()
    {
        return students;
    }

    public String getName()
    {
        return name;
    }

    public LocalDate getStartDate()
    {
        return startDate;
    }

    public LocalDate getEndDate()
    {
        return endDate;
    }

    public String toString()
    {
        return name;
    }
}