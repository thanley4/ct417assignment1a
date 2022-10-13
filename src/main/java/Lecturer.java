import org.joda.time.*;
import java.util.ArrayList;
import java.util.List;

public class Lecturer
{
    private final String name;
    private final int age;
    private final LocalDate dateOfBirth;
    private final List<Module> modules;

    public Lecturer(String name, LocalDate dateOfBirth)
    {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        Years ageYears = Years.yearsBetween(dateOfBirth, new LocalDate());
        this.age = ageYears.getYears();
        this.modules = new ArrayList<>();
    }

    public String getUsername()
    {
        return name + age;
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

    public String toString()
    {
        return name;
    }
}