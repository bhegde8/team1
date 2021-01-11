import junit.framework.*;
import java.awt.Color;
import java.io.*;


public class TestMapGetLoc {
	
	public void testMapGetLoc() {
		NoFrame frame = new NoFrame();
		Map map = frame.getMap();
		frame.addGhost(new Location(2,4), "Luke", Color.red);
		frame.addPacMan(new Location(4,6));

		assertEquals(map.getLoc(new Location (2,4)), Map.Type.GHOST); 
		assertEquals(map.getLoc(new Location (4,6)), Map.Type.PACMAN);

	}
}
