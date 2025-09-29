package es.nizam;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Clase principal de la aplicación JavaFX que carga la interfaz gráfica
 * desde un archivo FXML y muestra una ventana con un selector de color RGB.
 *
 * La clase establece un tamaño mínimo para la ventana para evitar que
 * sea redimensionada a dimensiones menores que 400x300 píxeles.
 *
 * @author [NIZAM]
 */
public class App extends Application {

    /** Ancho mínimo permitido para la ventana (en píxeles). */
    private final double MIN_WIDTH = 400;

    /** Altura mínima permitida para la ventana (en píxeles). */
    private final double MIN_HEIGHT = 300;

    /**
     * Método principal que inicia la aplicación JavaFX. Carga el archivo FXML,
     * configura la escena y aplica restricciones de tamaño mínimo a la ventana.
     *
     * @param stage El escenario (ventana principal) proporcionado por JavaFX.
     * @throws Exception Si ocurre un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/FXML/color_slider.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), MIN_WIDTH, MIN_HEIGHT);
        stage.setTitle("Selector de Color RGB");
        stage.setScene(scene);

        // Listener para evitar que la ventana sea más pequeña que MIN_WIDTH x MIN_HEIGHT
        stage.widthProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal.doubleValue() < MIN_WIDTH) {
                stage.setWidth(MIN_WIDTH);
            }
        });

        stage.heightProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal.doubleValue() < MIN_HEIGHT) {
                stage.setHeight(MIN_HEIGHT);
            }
        });

        stage.show();
    }

    /**
     * Método main que lanza la aplicación JavaFX.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        launch();
    }
}
