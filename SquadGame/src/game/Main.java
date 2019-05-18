package game;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
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
		
		
		Group group = new Group();
		Canvas gameCanvas = new Canvas(SIZE,SIZE);
		GraphicsContext context = gameCanvas.getGraphicsContext2D();
		Image image = new Image("Sprites/testImage.png");
		context.drawImage(image, 5,5,64,48);
		
		
		Scene scene = new Scene(group,SIZE,SIZE);
		
		group.getChildren().add(gameCanvas);
		
		window.setScene(scene);
		window.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	
	
}
