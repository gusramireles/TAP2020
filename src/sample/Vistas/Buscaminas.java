package sample.Vistas;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Buscaminas extends Stage {
    private Label _lblNoRows, _lblNoCols;
    private TextField _txtNoRows, _txtNoCols;
    private Button _btnMinar;
    private GridPane _bdpCampo;
    private Button[][] _arrBtnCeldas;
    private Scene _scnEscena;
    private VBox vbox;
    private HBox hbox;

    public Buscaminas(){
        crearGUI();
        this.setTitle("Buscaminas :v");
        this.setScene(_scnEscena);
        this.show();
    }

    public void crearGUI(){
        vbox = new VBox();
        hbox = new HBox();
        hbox.setSpacing(10);

        hbox.setAlignment(Pos.CENTER);

        _lblNoRows = new Label("No. Rows");
        _lblNoCols = new Label("No. Cols");
        _txtNoRows = new TextField();
        _txtNoRows.setMaxWidth(50);
        _txtNoCols = new TextField();
        _txtNoCols.setMaxWidth(50);

        hbox.getChildren().addAll(_lblNoRows, _txtNoRows, _lblNoCols, _txtNoCols);
        vbox.getChildren().addAll(hbox);

        _scnEscena = new Scene(vbox, 350, 350);
    }
}
