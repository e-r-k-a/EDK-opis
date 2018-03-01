package EDK_fx.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import model.*;

public class Main extends Application {
	final String VERSION = "1.0";
	public PointManager pm  = new PointManager();
	
	@Override
	public void start(Stage stage) throws Exception {
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource(
                "/EDK_fx/view/MainPane.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("EDK - wersja " + VERSION);
        stage.show();
        //utworzenie managera punktow
      
        
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
