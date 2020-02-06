package sample.Eventos;

import javafx.event.Event;
import javafx.event.EventHandler;

public class EventoBuscaminas implements EventHandler {

    @Override
    public void handle(Event event) {
        System.out.println("Mi segundo evento :'v");
    }
}
