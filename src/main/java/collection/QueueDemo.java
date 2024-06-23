package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // FIFO - First In First Out
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1); // Thêm phần tử
        // [1]
        queue.offer(3);
        // [1, 3]
        queue.offer(5);
        // [1, 3, 5]

        int peek = queue.peek(); // Xem phần tử đầu tiên trong hàng đợi (không xóa phần tử)
        // 1

        int poll = queue.poll(); // Lấy phần tử đầu tiên trong hàng đợi (xóa phần tử)
        // 1
    }
}
