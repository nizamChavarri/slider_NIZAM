module org.example {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.nizam to javafx.fxml;
    exports es.nizam;
}