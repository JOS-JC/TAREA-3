public class Student {
    private int id;
    private String nombre;
    private int age;

    public Student(int id, String nombre, int age) {
        this.id = id;
        this.nombre = nombre;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + nombre + '\'' + ", age=" + age + '}';
    }
}
