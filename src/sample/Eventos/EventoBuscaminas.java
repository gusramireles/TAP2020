package sample.Eventos;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class EventoBuscaminas implements EventHandler {

    private TextField _txtNoRows, _txtNoCols;
    private GridPane _gdpCampo;
    private Button[][] _arrBtnCeldas;

    @Override
    public void handle(Event event) {
    }
}
