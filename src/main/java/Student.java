import org.joda.time.*;
import java.util.ArrayList;
import java.util.List;

public class Student
{
    private final String name;
    private final int age;
    private final LocalDate dateOfBirth;
    private final int id;
    private final List<Course> courses;
    private final List<Module> modules;

    public Student(String name, LocalDate dateOfBirth, int id)
    {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        Years ageYears = Years.yearsBetween(dateOfBirth, new LocalDate());
        this.age = ageYears.getYears();
        this.id = id;
        this.courses = new ArrayList<>();
        this.modules = new ArrayList<>();
    }

    public String getUsername()
    {
        return name + age;
    }

    public List<Course> getCourses()
    {
        return courses;
    }

    public List<Module> getModules()
    {
        return modules;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public LocalDate getDateOfBirth()
    {
        return dateOfBirth;
    }

    public int getId()
    {
        return id;
    }

    public String toString()
    {
        return id + ": " + name;
    }
}