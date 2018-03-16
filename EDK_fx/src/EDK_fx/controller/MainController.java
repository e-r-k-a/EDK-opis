
package EDK_fx.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import java.net.URL;
import java.util.MissingFormatArgumentException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.*;
import model.*;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

public class MainController {

	
	@FXML
	private MainPaneController mainPaneController;
	
	@FXML
	private AddCommentPointController addCommentPointController;
	

	@FXML
	public void initialize() {
		System.out.println("MainController.initialize()");
		mainPaneController.init(this);
		addCommentPointController.init(this);
		
		System.out.println(mainPaneController);
		System.out.println(addCommentPointController);
	}


	public void setMainText(String s) {
		mainPaneController.mainTextArea.setText(s);
		return;
		
	}

}
