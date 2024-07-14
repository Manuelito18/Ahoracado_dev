package game;

import java.awt.Image;
import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

public class GameFacade {
    private String palabra;
    private Set<Character> letrasAdivinadas;
    private Set<Character> letrasErroneas;
    private int errores;

    public GameFacade() {
        letrasAdivinadas = new HashSet<>();
        letrasErroneas = new HashSet<>();
    }

    public void iniciarJuego() {
        palabra = "EXAMPLE"; // Aquí puedes agregar lógica para seleccionar una palabra aleatoria
        letrasAdivinadas.clear();
        letrasErroneas.clear();
        errores = 0;
    }

    public void procesarLetra(char letra) {
        letra = Character.toUpperCase(letra);
        if (palabra.indexOf(letra) >= 0) {
            letrasAdivinadas.add(letra);
        } else {
            letrasErroneas.add(letra);
            errores++;
        }
    }

    public String obtenerPalabraAdivinada() {
        StringBuilder sb = new StringBuilder();
        for (char c : palabra.toCharArray()) {
            if (letrasAdivinadas.contains(c)) {
                sb.append(c).append(' ');
            } else {
                sb.append('_').append(' ');
            }
        }
        return sb.toString();
    }

    public int obtenerErrores() {
        return errores;
    }

    public Image obtenerImagen() {
        // Aquí debes agregar la lógica para retornar la imagen correspondiente al número de errores
        return new ImageIcon(getClass().getResource("/res/ahorcado" + errores + ".png")).getImage();
    }
}
