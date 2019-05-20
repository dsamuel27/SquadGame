package game;

import com.sun.javafx.geom.BaseBounds;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.javafx.jmx.MXNodeAlgorithm;
import com.sun.javafx.jmx.MXNodeAlgorithmContext;
import com.sun.javafx.sg.prism.NGNode;

import javafx.scene.Node;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Translate;

public class GameCanvas extends Canvas {

	private GameManager gameManager;
	private GraphicsContext graphicsContext;
	
	public GameCanvas(GameManager manager) {
		super(manager.SIZE,manager.SIZE);
		this.gameManager = manager;
		
		//graphicsContext = this.getGraphicsContext2D();
		
	}
	
	public void beginGame() {
		graphicsContext = this.getGraphicsContext2D();
		new Thread(new Runnable(){
		    public void run(){
		    	int i = 4;
		    	Translate translate = new Translate(1,0);
	    		Image image = new Image("Sprites/testImage.png");
	    		ImageView view = new ImageView(image);
	    		graphicsContext.drawImage(view.getImage(), 5,5,64,48);
		    	while (true) {
		    		
		    		graphicsContext.clearRect(0, 0, gameManager.SIZE, gameManager.SIZE);
		    		view.setTranslateX(2);
		    		view.setX(view.getX() + view.getTranslateX());
		    		graphicsContext.drawImage(view.getImage(), view.getX(),view.getY(),64,48);
		    		try {
						Thread.sleep(30);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		    		}
		    }
		}).start();
		
	}

}
