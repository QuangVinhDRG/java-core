package statics;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // Question 1
        List<Student> students = new ArrayList<>();
        Student student1 = new Student(1, "Nguyễn Văn A");
        students.add(student1);
        Student student2 = new Student(2, "Nguyễn Văn B");
        students.add(student2);
        Student student3 = new Student(3, "Nguyễn Văn C");
        students.add(student3);
        Student.college = "Đại học Bách khoa";
        for (Student student : students) {
            System.out.println(student);
        }
        Student.college = "Đại học Công nghệ";
        for (Student student : students) {
            System.out.println(student);
        }

        // Question 2
        for (Student student : students) {
            student.addMoney(100);
        }
        System.out.println("B1 = " + Student.getGroupMoney());

        student1.spendMoney(50);
        System.out.println("B2 = " + Student.getGroupMoney());

        student2.spendMoney(20);
        System.out.println("B3 = " + Student.getGroupMoney());

        student3.spendMoney(150);
        System.out.println("B4 = " + Student.getGroupMoney());

        for (Student student : students) {
            student.addMoney(50);
        }
        System.out.println("B5 = " + Student.getGroupMoney());

        // Question 3
        int result = MyMath.max(5, 7);
        System.out.println("result = " + result);

        // Question 4
        // Question 5
        System.out.println("Num of Student = " + Student.numOfStudent);

        // Question 6
        try {
            Student pStudent1 = new PrimaryStudent(4, "Nguyễn Văn D");
            Student pStudent2 = new PrimaryStudent(5, "Nguyễn Văn E");
            Student sStudent1 = new SecondaryStudent(6, "Nguyễn Văn F");
            Student sStudent2 = new SecondaryStudent(7, "Nguyễn Văn G");
            Student sStudent3 = new SecondaryStudent(8, "Nguyễn Văn H");
            Student sStudent4 = new SecondaryStudent(9, "Nguyễn Văn I");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Num of Student = " + Student.numOfStudent);
            System.out.println("Num of Primary Student = " + PrimaryStudent.numOfStudent);
            System.out.println("Num of Secondary Student = " + SecondaryStudent.numOfStudent);
        }

        // Question 8
        try {
            HinhHoc hinhHoc1 = new HinhTron(1);
            HinhHoc hinhHoc2 = new HinhTron(1);
            HinhHoc hinhHoc3 = new HinhChuNhat(1, 2);
            HinhHoc hinhHoc4 = new HinhChuNhat(1, 2);
            HinhHoc hinhHoc5 = new HinhTron(1);
            HinhHoc hinhHoc6 = new HinhTron(1);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
