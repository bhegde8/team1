import junit.framework.*;
import java.awt.Color;
import java.io.*;


public class TestMapGetLoc {
	
	public void testMapGetLoc() {
		Mainframe frame = new MainFrame();
		Map map = new Map(64);
		Ghost ghost = frame.addGhost(new Location(2,4), "Luke", Color.red);
		PacMan pacman = frame.addPacMan(new Location(4,6));

		assertEquals(map.getLoc(new Location (2,4)), Map.Type.GHOST); 
		assertEquals(map.getLoc(new Location (4,6)), Map.Type.PACMAN);

	}
}
