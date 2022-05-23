package utilities;

public class Sleep {

    public static void sleep(int seconds) throws InterruptedException {
        Thread.sleep(seconds*1000);
    }
}
