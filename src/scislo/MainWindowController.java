package scislo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainWindowController {

    private Person person = new Person(1, "Karol", "Sztrazburger");

    private Main main;

    @FXML
    private Button button;
    @FXML
    private TextField input;
    @FXML
    private Label label;


    public MainWindowController() {
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    public void handleButton() {
        this.person.setFirstName(this.input.getText());
        this.label.setText(this.person.getFirstName());
    }



}
