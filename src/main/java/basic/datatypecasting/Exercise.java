package basic.datatypecasting;

import java.util.Random;

public class Exercise {
    void question1() {
        float salary1, salary2;
        salary1 = 5240.5f;
        salary2 = 10970.055f;
        int roundedSalary1 = (int) salary1;
        int roundedSalary2 = (int) salary2;
        System.out.println("roundedSalary1 = " + roundedSalary1);
        System.out.println("roundedSalary2 = " + roundedSalary2);
    }

    void question2() {
        Random random = new Random();
        System.out.printf("%05d", random.nextInt());
    }
}
