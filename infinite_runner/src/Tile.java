import java.awt.Color;
import java.awt.Graphics;

import infinite_runner.Camera;

public class Tile {

	public int x,y;

	
	
	public Tile(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void tick() {
		if(x -Camera.x < -32) {  //OTIMIZAÇÃO 
			World.tiles.remove(this);
			return;
		}
		
	}
	
	public void render(Graphics g) {
	/*	g.setColor(Color.blue);
		g.fillRect(x - Camera.x, y - Camera.y, World.blockSize,World.blockSize);
		
		g.setColor(Color.black);
		g.drawRect(x - Camera.x, y - Camera.y, World.blockSize,World.blockSize);
	*/
		g.drawImage(Game.floorSprite, x - Camera.x,y - Camera.y,World.blockSize,World.blockSize, null);
	}
	
	
}
