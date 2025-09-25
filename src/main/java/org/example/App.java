package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    private final double MIN_WIDTH = 400;
    private final double MIN_HEIGHT = 300;

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("color_slider.fxml"));
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

    public static void main(String[] args) {
        launch();
    }
}
