public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try {
            // ArithmeticException
            int a = 1;
            int b = 0;
//            System.out.println(a / b);

            // NullPointerException
            String s = null;
//            System.out.println(s.length());

            // ArrayIndexOutOfBoundsException
            int[] array = {1, 2, 3};
//            System.out.println(array[100]);

            // Exception
            throw new Exception("Ngoại lệ không xác định");

            // Bắt những Exception con (ArithmeticException,...) trước khi bắt Exception cha
        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException exception) {
//            System.out.println("Không thể chia cho 0");
            System.out.println(exception.getMessage()); // Băt riêng từng lỗi
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Bắt lôi chung
        } finally {
            System.out.println("Khối finally luôn được gọi dù có lỗi hay không");
        }

        // try catch
        // try finally
        // try catch finally
    }
}
