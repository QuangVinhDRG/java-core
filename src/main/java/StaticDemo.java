public class StaticDemo {
    public static void main(String[] args) {
        // Static property
        try {
            Student s1 = new Student("Long");
            System.out.println("s1 = " + s1);
            Student s2 = new Student("Quân");
            System.out.println("s2 = " + s2);
            Student s3 = new Student("Linh");
            System.out.println("s3 = " + s3);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Số lượng học sinh: " + Student.getCount());// Truy cập thông qua class, thuộc về tập thể, bộ nhớ dùng chung.
        }

        // Static method
        System.out.println("Math.max(1, 2) = " + Math.max(1, 2));
    }
}
