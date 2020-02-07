package sample.Eventos;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class EventoBuscaminas implements EventHandler {

    private TextField _txtNoRows, _txtNoCols;
    private GridPane _gdpCampo;
    private Button[][] _arrBtnCeldas;
    private VBox vbox;

    public EventoBuscaminas(TextField _txtNR, TextField _txtNC){
        this._txtNoRows = _txtNR;
        this._txtNoCols = _txtNC;
    }

    @Override
    public void handle(Event event) {
        int _nr = Integer.parseInt(_txtNoRows.getText());
        int _nc = Integer.parseInt(_txtNoCols.getText());
        _arrBtnCeldas = new Button[_nr][_nc];
    }
}
