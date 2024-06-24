package statics;

public class PrimaryStudent extends Student {
    protected static int numOfStudent;

    public PrimaryStudent(int id, String name) {
        super(id, name);
        numOfStudent++;
    }
}
