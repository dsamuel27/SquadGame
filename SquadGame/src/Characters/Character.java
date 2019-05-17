package Characters;

import Game.Location;

/* Abstract class that represents a Character*/
public interface Character {
	
	 public void move();
	
	
	 public int getHealth();
	 public void setHealth();
	 public void increaseHealth();
	 public void decreaseHealth();
	 
	 public void setLocation(int x, int y);
	 public Location getLocation();
	 
	 public boolean isDead();
	
}
