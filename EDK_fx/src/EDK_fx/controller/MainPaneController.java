
package EDK_fx.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.*;
import model.*;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

public class MainPaneController implements Initializable {

	public PointManager pm = new PointManager(); // utworzenie managera punktow
	private MainController mainController;
	

//	@FXML
//	private Button btnCommentPoint;
//	@FXML
//	private Button btnAudioPoint;
//	@FXML
//	private Button btnPicturePoint;
//	@FXML
//	private Button btnShowManager;
//	@FXML
//	private Button btnClearTextArea;
//	@FXML
//	public TextArea mainTextArea;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("MainPaneController.inintialize()");
	/*	btnCommentPoint.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Wygenerowano zdarzenie " + event.getEventType());
				mainTextArea.setText("dodajemy Commenta\n");
				CommentPoint commentPoint = new CommentPoint(1.2, 2.3, "nazwa1", "opis1", "koment1");
				pm.add(commentPoint);
				mainTextArea.setText(mainTextArea.getText() + pm.toString() + "\n");
			}
		});
		btnAudioPoint.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Wygenerowano zdarzenie " + event.getEventType());
				AudioPoint audioPoint = new AudioPoint(16.54, 22.45, "audio1", "opis audio pointa1", "record1");
				pm.add(audioPoint);
				btnShowManager.fire();
			}
		});
		btnPicturePoint.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try {
					FXMLLoader fxmlLoader = new FXMLLoader(
							getClass().getResource("/EDK_fx/view/AddCommentPointPane.fxml"));
					Parent root1 = (Parent) fxmlLoader.load();
					Stage stage = new Stage();
					stage.setScene(new Scene(root1));
					stage.show();
				} catch (Exception e) {
					e.printStackTrace();
				}

				// PicturePoint picturePoint = new PicturePoint(16.54, 22.45, "audio1", "opis
				// audio pointa1", "record1");
				// pm.add(picturePoint);
				//btnShowManager.fire();
			}
		});
		btnShowManager.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("Wciœniêty klawisz Poka¿ Managera");
				mainTextArea.clear();
				mainTextArea.setText(pm.toString());

			}
		});
		btnClearTextArea.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Wygenerowano zdarzenie " + event.getEventType());
				mainTextArea.clear();
			}
		});
		// Parent parent = (Parent)
		// FXMLLoader.load(getClass().getResource("/EDK_fx/view/AddCommentPointController.fxml"));
		// Scene scene = new Scene(parent);
		// Stage stage;
		// stage.setScene(scene);
		// stage.setTitle("Dodawanie punktu ");
		// stage.show();
*/
	}

//	public void init(MainController main) {
	//	mainController = main;
		
//	}

}
