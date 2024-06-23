package collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Stack: đến trước, xử lý sau (LIFO - Last In First Out)
        Stack<Integer> stack = new Stack<>();

        stack.push(3); // Thêm phần tử vào đỉnh của stack
        // [3]
        stack.push(5);
        // [3, 5]
        stack.push(7);
        // [3, 5, 7]

        int peek = stack.peek(); // Xem phần tử ở đỉnh (không xóa phần tử)
        // 7

        int pop = stack.pop(); // Lấy phần tử ở đỉnh (xóa đi phần tử đó)
        // 7

        // Ứng dụng: làm chức năng Undo, Redo
    }
}
