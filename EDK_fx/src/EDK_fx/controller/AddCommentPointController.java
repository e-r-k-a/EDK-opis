/**
 * Sample Skeleton for 'AddCommentPointPane.fxml' Controller Class
 */

package EDK_fx.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddCommentPointController implements Initializable {
	
	private MainController mainController;

	@FXML // fx:id="DescriptionTextField"
	private TextArea DescriptionTextField; // Value injected by FXMLLoader

	@FXML // fx:id="XGpsTextField"
	private TextField XGpsTextField; // Value injected by FXMLLoader

	@FXML // fx:id="YGpsTextField"
	private TextField YGpsTextField; // Value injected by FXMLLoader

	@FXML // fx:id="NameTextField"
	private TextField NameTextField; // Value injected by FXMLLoader

	@FXML // fx:id="SaveButton"
	private Button btnSave; // Value injected by FXMLLoader

	@FXML // fx:id="CancelButton"
	private Button btnCancel; // Value injected by FXMLLoader

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("AddCommentPointController.initialize()");
		NameTextField.setText("wwwwsdcsdcsdc");
//		Stage addComentStage  = mainPaneController. controlPaneController.getLowerCaseButton();
		
		btnSave.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Wcisniety save");
				mainController.setMainText("cos tam");
				//utworz CommentPointa i dodaj do managera punktów		
			}
		});
		btnCancel.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Wcisniety cancel");
				//zamknij okno dodawania punktów
			//	Stage.close();
			}
		});

	}

	public void init(MainController main) {
		mainController = main;
		
	}
}
