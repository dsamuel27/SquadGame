package game;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	private Stage window;
	
	public static final int SIZE = 500;
	public static final String gameName = "SQUAD GAME";
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle(gameName);
		window.setHeight(SIZE);
		window.setWidth(SIZE);
		window.show();
		
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	
	
}
