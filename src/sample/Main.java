package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import sample.Vistas.Buscaminas;

public class Main extends Application {
    private MenuBar _mnbPrincipal;
    private Menu _mnCompetencia1, _mnCompetencia2, _mnSalir;
    private MenuItem _mitPractica1, _mitExit;

    @Override
    public void start(Stage primaryStage) throws Exception{

        _mnbPrincipal = new MenuBar();
        _mnCompetencia1 = new Menu("Competencia 1");
        _mnCompetencia2 = new Menu("Competencia 2");
        _mnSalir = new Menu("Salir");

        _mitPractica1 = new MenuItem("Buscaminas");
        _mitPractica1.setOnAction(event -> OpcionMenu(1));

        _mitExit = new MenuItem("Bye");
        _mitExit.setOnAction(event -> OpcionMenu(99));

        _mnCompetencia1.getItems().addAll(_mitPractica1);
        _mnSalir.getItems().addAll(_mitExit);

        //Carga al menuBar
        _mnbPrincipal.getMenus().addAll(_mnCompetencia1, _mnCompetencia2, _mnSalir);

        primaryStage.setMaximized(true);
        primaryStage.setTitle("Tópicos Avanzados de Programación 2020 :v");
        primaryStage.setScene(new Scene(_mnbPrincipal, 300, 275));
        primaryStage.show();
    }

    private void OpcionMenu(int i) {
        switch (i){
            case 1:
                new Buscaminas();
                break;
            case 99:
                System.exit(0);
                break;
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
