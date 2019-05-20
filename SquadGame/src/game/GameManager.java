package game;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GameManager extends Application {

	private Stage window;
	private Canvas gameCanvas;
	private GraphicsContext graphicsContext;
	private Pane gamePane;
	
	public static final int SIZE = 500;
	public static final String gameName = "SQUAD GAME";
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		window = initWindow(primaryStage);
		gamePane = new Pane();
		setupPane(gamePane);
		Scene scene = new Scene(gamePane);
		window.setScene(scene);
		
		switchToGame();
	}
	
	

	private void setupPane(Pane pane) {
		pane.setMaxHeight(SIZE);
		pane.setMinHeight(SIZE);
		pane.setMaxWidth(SIZE);
		pane.setMinWidth(SIZE);
		
		
		
	}



	private void switchToGame() {
		// TODO Auto-generated method stub
		gamePane.getChildren().clear();
		GameCanvas game = new GameCanvas(this);
		gamePane.getChildren().add(game);
		game.beginGame();
	}



	public static void main(String[] args) {
		launch(args);
	}
	
	private Stage initWindow(Stage stage) {
		
		stage.setTitle(gameName);
		stage.setHeight(SIZE);
		stage.setWidth(SIZE);
		stage.show();
		return stage;
	}

	/*
	private void setUpCanvas() {
		Group group = new Group();
		gameCanvas = new Canvas(SIZE,SIZE);
		graphicsContext = gameCanvas.getGraphicsContext2D();
		
		Image image = new Image("Sprites/testImage.png");
		graphicsContext.drawImage(image, 5,5,64,48);
		
		Scene scene = new Scene(group,SIZE,SIZE);
		group.getChildren().add(gameCanvas);
		
		window.setScene(scene);
	} */
	
	
}
