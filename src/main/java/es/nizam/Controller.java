package es.nizam;

import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Controlador del archivo FXML para la aplicación de selector de color RGB.
 * Gestiona la interacción entre los sliders de colores (Rojo, Verde y Azul)
 * y el rectángulo que muestra el color resultante.
 *
 * Se encarga también de ajustar el tamaño del rectángulo al tamaño de la ventana.
 *
 * @author [NIZAM]
 */
public class Controller {

    /** Slider para ajustar el valor del componente rojo (R) del color. */
    @FXML private Slider sliderRojo;

    /** Slider para ajustar el valor del componente verde (G) del color. */
    @FXML private Slider sliderVerde;

    /** Slider para ajustar el valor del componente azul (B) del color. */
    @FXML private Slider sliderAzul;

    /** Rectángulo que muestra visualmente el color resultante. */
    @FXML private Rectangle colorRect;

    /** Panel raíz de la interfaz, utilizado para ajustar dinámicamente el tamaño del rectángulo. */
    @FXML private BorderPane rootPane;

    /**
     * Método de inicialización llamado automáticamente por JavaFX después de cargar el FXML.
     * Establece listeners en los sliders para actualizar el color mostrado en tiempo real
     * y vincula el tamaño del rectángulo al tamaño del panel principal.
     */
    @FXML
    private void initialize() {
        sliderRojo.valueProperty().addListener((obs, oldVal, newVal) -> actualizarColor());
        sliderVerde.valueProperty().addListener((obs, oldVal, newVal) -> actualizarColor());
        sliderAzul.valueProperty().addListener((obs, oldVal, newVal) -> actualizarColor());

        colorRect.widthProperty().bind(rootPane.widthProperty().subtract(20));
        colorRect.heightProperty().bind(rootPane.heightProperty().subtract(220)); // Ajuste para dejar espacio a sliders
    }

    /**
     * Actualiza el color del rectángulo en función de los valores actuales de los sliders RGB.
     * Convierte los valores a enteros y aplica el color utilizando {@link Color#rgb(int, int, int)}.
     */
    private void actualizarColor() {
        int r = (int) sliderRojo.getValue();
        int g = (int) sliderVerde.getValue();
        int b = (int) sliderAzul.getValue();
        colorRect.setFill(Color.rgb(r, g, b));
    }
}
