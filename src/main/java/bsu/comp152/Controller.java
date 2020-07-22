package bsu.comp152;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * A Controller class
 * See Main.java for details.
 */
// public class Controller implements Initializable {
public class Controller {

    /* Here @FXML is needed to connect the Label initialized in Main.fxml
     * to this controller.
     */
    @FXML
    private Label intro_message;
    /* The name "intro_message" is the fx:id defined in Code for
     * the Label in Scene Builder.
     */

    /* Here is the code we previously wrote by overriding
     * the abstract method handle from the EventHandler
     * interface inside an inner class.
     *
     * It responds to a button click to produce "Hello World!"
     * in the console or it changes the text in the Label.
     */
    public void pressButton(ActionEvent event) {
        // System.out.println("Hello World!");
        intro_message.setText("Thanks for clicking the button!");

    }
    /*
    @Override
    public void initialize(URL location, ResourceBundle resources){
        intro_message.getText();
    }
     */

}
