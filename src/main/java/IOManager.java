import java.io.*;

public class IOManager {
    public static void writeFile(String path, byte[] bytes, boolean append) {
        try (FileOutputStream fos = new FileOutputStream(path, append)) { // Sử dụng xong giải phóng, có cha là interface Closable
            fos.write(bytes);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static byte[] readFile(String path) {
        try (FileInputStream fis = new FileInputStream(path)) {
            byte[] bytes = new byte[fis.available()]; // available(): độ dài file
            fis.read(bytes);
            return bytes;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    // Để xài được thì Object cần implements Serializable
    public static void writeObject(String path, Object object, boolean append) {
        try (
                FileOutputStream fos = new FileOutputStream(path, append);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(object);
        } catch (IOException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }

    public static Object readObject(String path) {
        try (
                FileInputStream fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
