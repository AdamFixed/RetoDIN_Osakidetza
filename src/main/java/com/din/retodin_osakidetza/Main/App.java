package com.din.retodin_osakidetza.Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    /**
     * Inicia la aplicacion con JavaFx.
     *
     * @param stage El escenario principal de la aplicación.
     * @throws IOException Si ocurre un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("login"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }
    /**
     * Cambia la raíz de la escena a un nuevo archivo FXML.
     *
     * @param fxml El nombre del archivo FXML a cargar (sin la extensión .fxml).
     * @throws IOException Si ocurre un error al cargar el archivo FXML.
     */
    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }
    /**
     * 
     * Carga un archivo FXML y lo devuelve como un nodo padre.
     * 
     * @param fxml El nombre del archivo FXML a cargar.
     * @return El nodo padre cargado desde el archivo FXML.
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/com/din/retodin_osakidetza/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }
    /**
     * Lanza la aplicacion.
     *
     * @param args Argumentos.
     */
    public static void main(String[] args) {
        launch();
    }

}
