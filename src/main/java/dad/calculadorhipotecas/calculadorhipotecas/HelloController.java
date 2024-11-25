package dad.calculadorhipotecas.calculadorhipotecas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class HelloController {
    HipotecaApiClient hipotecaApiClient = new HipotecaApiClient();

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private TextArea anyosText;

    @FXML
    private Button calcularButton;

    @FXML
    private TextArea capitalText;

    @FXML
    private TableView<?> datosView;

    @FXML
    private TextArea interesText;

    @FXML
    private BorderPane root;

    @FXML
    void calcularOnAction(ActionEvent event) {
        HipotecaApiClient.conexionApi("3000", "10000", "3.5", "20");

    }
}