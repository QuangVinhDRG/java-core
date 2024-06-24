package statics;

public class SecondaryStudent extends Student {
    protected static int numOfStudent;

    public SecondaryStudent(int id, String name) {
        super(id, name);
        numOfStudent++;
    }
}
