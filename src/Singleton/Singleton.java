package Singleton;

/**
 * Created by pawel on 10.05.16.
 */
public class Singleton {
    private static volatile Singleton INSTANCE;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (INSTANCE == null)
            synchronized (Singleton.class) {
                if (INSTANCE == null)
                    INSTANCE = new Singleton();
            }
        return INSTANCE;
    }
}
