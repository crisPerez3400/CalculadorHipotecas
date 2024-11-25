module dad.calculadorhipotecas.calculadorhipotecas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;


    opens dad.calculadorhipotecas.calculadorhipotecas to javafx.fxml;
    exports dad.calculadorhipotecas.calculadorhipotecas;
}