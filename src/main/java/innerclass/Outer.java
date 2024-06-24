package innerclass;

public class Outer {
    private int value;
    private static int count = 3;

    public Outer(int value) {
        this.value = value;
    }

    public class Inner {
        public void showInfo() {
            System.out.println("value = " + value); // Truy cập được thuộc tính private của class chứa nó
            System.out.println("count = " + count);
        }
    }

    public static class Nested {
        public void showInfo() {
//            System.out.println("value = " + value); // Tập thể ko thể truy cập cá nhân, nhưng cá nhân có thể truy cập tập thể (static không thể truy cập non-static, ngược lại, non-static lại có thể truy cập được static)
            System.out.println("count = " + count);
        }
    }
}
