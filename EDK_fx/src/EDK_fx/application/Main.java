package EDK_fx.application;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import model.*;

public class Main extends Application {
	public final String VERSION = "1.0";
	static int[][] board = new int[9][9];

	@Override
	public void init() throws Exception {
		super.init();
		System.out.println("Main init()");
	}

	@Override
	public void start(Stage stage) throws Exception {
		System.out.println("Main start()");
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/EDK_fx/view/MainPane.fxml"));
		System.out.println("Po loaderze");
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("EDK - wersja " + VERSION);
		stage.show();

	}

	public static void main(String[] args) {

		launch(args);
	}
}
