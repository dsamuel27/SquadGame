package characters;

import game.Location;
import javafx.scene.image.Image;

/* Abstract class that represents a Character  */
public interface Character {
	
	 
	 public void setVelocity();
	 
	
	 public int getHealth();
	 public void updateHealth(int healthToAdd);
	
	 
	 public void move(int x, int y);
	 public Location getLocation();
	 
	 public boolean isDead();
	 
	 public Image getImage(); 
	
}
