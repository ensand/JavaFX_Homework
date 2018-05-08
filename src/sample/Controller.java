package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class Controller {

//    Button button1 = new Button();
    @FXML
    TextField textField1 = new TextField();
    @FXML
    ComboBox comboBox1 = new ComboBox();
    private ObservableList<String> options1 = FXCollections.observableArrayList("feck off", "eat shit", "begone thot");

    public void text(){
        System.out.println(textField1.getText());
    }

    public void initialize(){
        System.out.println("Hello there, general Kenobi");
        comboBox1.setItems(options1);
    }

}
