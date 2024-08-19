import java.util.List;
import java.util.stream.Collectors;

public class StudentManagerImpl implements StudentManager{
    private GenericList<Student> studentList;

    public StudentManagerImpl() {
        studentList = new GenericList<>();
    }

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void removeStudent(int id) {
        Student student = (Student) studentList.find(id);
        if (student != null) {
            studentList.remove(student);
        }
    }

    @Override
    public Student findStudent(int id) throws StudentNotFoundException {
        Student student = (Student) studentList.find(id);
        if (student == null) {
            throw new StudentNotFoundException("Student with id " + id + " not found.");
        }
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentList.getList().stream().collect(Collectors.toList());
    }
}
