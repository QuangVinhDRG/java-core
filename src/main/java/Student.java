public class Student {
    private String name;

    private static int id;
    private static int count;

    public Student(String name) {
        if (count >= 2) {
            throw new IllegalStateException("Tối đa 2 học sinh");
        }
        this.id = ++count;
        this.name = name;
    }

    public static int getCount() {
        return count;
    }
}
