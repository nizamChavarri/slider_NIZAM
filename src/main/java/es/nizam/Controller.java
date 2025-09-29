package es.nizam;

import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Controller {

    @FXML private Slider sliderRojo;
    @FXML private Slider sliderVerde;
    @FXML private Slider sliderAzul;
    @FXML private Rectangle colorRect;

    @FXML private BorderPane rootPane;

    @FXML
    private void initialize() {
        sliderRojo.valueProperty().addListener((obs, oldVal, newVal) -> actualizarColor());
        sliderVerde.valueProperty().addListener((obs, oldVal, newVal) -> actualizarColor());
        sliderAzul.valueProperty().addListener((obs, oldVal, newVal) -> actualizarColor());

        colorRect.widthProperty().bind(rootPane.widthProperty().subtract(20));
        colorRect.heightProperty().bind(rootPane.heightProperty().subtract(220)); // Ajuste para dejar espacio a sliders
    }

    private void actualizarColor() {
        int r = (int) sliderRojo.getValue();
        int g = (int) sliderVerde.getValue();
        int b = (int) sliderAzul.getValue();
        colorRect.setFill(Color.rgb(r, g, b));
    }
}
