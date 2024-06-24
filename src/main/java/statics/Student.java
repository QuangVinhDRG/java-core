package statics;

public class Student {
    private int id;
    private String name;
    protected static String college;
    protected static int groupMoney;
    protected static int numOfStudent;

    public Student(int id, String name) {
        numOfStudent++;
        if (numOfStudent > 7) {
            numOfStudent--;
            throw new IllegalStateException("Không được vượt quá 7 học sinh");
        }
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    public static int getGroupMoney() {
        return groupMoney;
    }

    public static void setGroupMoney(int groupMoney) {
        Student.groupMoney = groupMoney;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                '}';
    }

    public void addMoney(int amount) {
        groupMoney += amount;
    }

    public void spendMoney(int amount) {
        groupMoney -= amount;
    }
}
