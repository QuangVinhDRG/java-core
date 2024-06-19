package polymorphism;

import abstraction.Circle;

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Tính đa hình
        // Student --> Person
        // Một đối tượng được sinh ra từ class nào thì nó sẽ có những hành vi viết ở trong class đấy
        // dù cho được lưu vào kiểu dữ liệu nào đi chăng nữa
        Student student = new Student("Huy", 24);
        student.run();
        Person person = student;
        person.run();

        // Được dùng khi 1 person có nhiều các class con như Student, Docter, Teacher,... và muốn chuyển các
        // class con vào trong List của class cha. Nó sẽ chung 1 list cha thay vì phải có nhiều list con.

        // Chỉ ép kiểu dữ liệu từ cha --> con

        // instanceof
        boolean isStudent = person instanceof Student;
        System.out.println("isStudent = " + isStudent);
        person.run();

        if (person instanceof Student) {
            Student student1 = (Student) person;
            student1.study();
        }
    }
}
