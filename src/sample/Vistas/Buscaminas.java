package sample.Vistas;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sample.Eventos.EventoBuscaminas;

public class Buscaminas extends Stage implements EventHandler {
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
        _btnMinar = new Button("Minar Campo");
        //_btnMinar.addEventHandler(MouseEvent.MOUSE_CLICKED, this);
        //_btnMinar.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventoBuscaminas());
        /*_btnMinar.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("Mi tercer evento :(");
            }
        });
         */

        //_btnMinar.setOnAction(event -> { System.out.println("Mi cuarto evento ;)"); });

        _btnMinar.setOnAction(event -> Evento());

        hbox.getChildren().addAll(_lblNoRows, _txtNoRows, _lblNoCols, _txtNoCols, _btnMinar);
        vbox.getChildren().addAll(hbox);

        _scnEscena = new Scene(vbox, 480, 480);
    }

    private void Evento() {
        System.out.println("Mi quinto evento :O");
    }

    @Override
    public void handle(Event event) {
        System.out.println("Mi primer evento :v");
    }
}
