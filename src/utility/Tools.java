package utility;

public class Tools {
    public static void Sleep(int sn) {
        try {
            Thread.sleep(sn * 1000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
