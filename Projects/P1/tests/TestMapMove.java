import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapMove {

	public void testMapMove() {
		
		NoFrame frame = new NoFrame();
		Map map = frame.getMap();

		Ghost ghost = frame.addGhost(new Location(4,5), "Ghost", Color.red);	
		PacMan pacman = frame.addPacMan(new Location(8,10));
		assertTrue(map.move("Ghost", new Location (5,5), Map.Type.GHOST));
	}
}
