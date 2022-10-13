import java.util.ArrayList;
import java.util.List;

public class Module
{
    private final String name;
    private final String code;
    private final List<Student> students;
    private Lecturer lecturer;
    private final List<Course> courses;

    public Module(String name, String code)
    {
        this.name = name;
        this.code = code;
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public List<Student> getStudents()
    {
        return students;
    }

    public List<Course> getCourses()
    {
        return courses;
    }

    public Lecturer getLecturer()
    {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer)
    {
        this.lecturer = lecturer;
    }

    public String getName()
    {
        return name;
    }

    public String getCode()
    {
        return code;
    }

    public String toString()
    {
        return name;
    }
}