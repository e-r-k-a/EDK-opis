
package EDK_fx.controller;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.*;
import model.*;
import EDK_fx.application;

public class MainController implements Initializable {

    @FXML
    private Button btnCommentPoint;

    @FXML
    private Button btnAudioPoint;

    @FXML
    private Button btnPicturePoint;

    @FXML
    private TextArea mainTextArea;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	 btnCommentPoint.setOnAction(new EventHandler<ActionEvent>() {
    	        @Override
    	        public void handle(ActionEvent event) {
    	            System.out.println("Wygenerowano zdarzenie " + event.getEventType());
    	            mainTextArea.setText("dodajemy Commenta\n");
    	            mainTextArea.setText(mainTextArea.getText() + "dodany\n");
    	            
    	        }
    	    });
    	 btnAudioPoint.setOnAction(new EventHandler<ActionEvent>() {
    	        @Override
    	        public void handle(ActionEvent event) {
    	            System.out.println("Wygenerowano zdarzenie " + event.getEventType());
    	            mainTextArea.setText("klawisz 2");
    	        }
    	    });
    }
    
  
    
}
