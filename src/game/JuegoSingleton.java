package game;

public class JuegoSingleton {
    private static JuegoSingleton instance;
    private final juego juegoInstance;

    private JuegoSingleton() {
        juegoInstance = new juego();
    }

    public static JuegoSingleton getInstance() {
        if (instance == null) {
            instance = new JuegoSingleton();
        }
        return instance;
    }

    public juego getJuegoInstance() {
        return juegoInstance;
    }
}