package es.nizam;

/**
 * Clase lanzadora de la aplicación JavaFX.
 * Se utiliza como punto de entrada alternativo para ejecutar la aplicación,
 * delegando el inicio a la clase {@link App}.
 *
 * Es especialmente útil en contextos donde {@code javafx.application.Application}
 * no puede ser usada directamente como clase principal (por ejemplo, al crear ejecutables
 * o usar ciertos entornos de empaquetado).
 *
 * @author [NIZAM]
 */
public class Lanzador {

    /**
     * Método principal que lanza la aplicación llamando a {@link App#main(String[])}.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        App.main(args);
    }
}
