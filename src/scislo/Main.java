package scislo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main.fxml"));
        fxmlLoader.setResources(ResourceBundle.getBundle("bundles.LangBundle", new Locale("en", "EN")));
        AnchorPane pane = fxmlLoader.load(); // To oznacza, że będziemy podpinać kontoler do AnchorPane
        primaryStage.setTitle("MVC1");
        primaryStage.setScene(new Scene(pane, 400, 300));
        primaryStage.setMinWidth(400);
        primaryStage.setMinHeight(300);
        MainWindowController mainWindowController = fxmlLoader.getController();
        mainWindowController.setMain(this);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
