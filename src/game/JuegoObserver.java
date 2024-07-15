package game;
import java.util.Set;

public interface JuegoObserver {
    void update(String palabraAdivinada, Set<Character> letrasErroneas, int fallos);
}