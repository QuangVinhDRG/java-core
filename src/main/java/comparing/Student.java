package comparing;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {
//        return Integer.compare(this.id, that.id); // order by id asc
//        return Integer.compare(this.id, that.id); // order by id desc
//        return that.name.compareTo(this.name); // order by name desc
        // order by id asc, name desc
        int c = Integer.compare(this.id, that.id);
        return c == 0 ? that.name.compareTo(this.name) : c;
    }
}
