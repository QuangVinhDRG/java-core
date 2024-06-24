package annotation;

public class AnnotationDemo {

    public static void main(String[] args) {
        // Cú pháp: @ + tên
        // Tác dụng: giúp trình biên dịch dễ nhận biết, sinh thêm code nếu cần, tránh lỗi

        // @Override: ghi đè
        // @Deprecated: đánh dấu lỗi thời
        // SuppressWarning: tắt cảnh báo lỗi thời (deprecation)
        @SuppressWarnings("deprecation")
        int max = Math.maxV1(1, 0);
        System.out.println("max = " + max);
    }

    @Override
    public String toString() {
        return "This is AnnotationDemo class";
    }
}
