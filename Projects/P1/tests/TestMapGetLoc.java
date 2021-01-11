import junit.framework.*;
import java.awt.Color;
import java.io.*;
import org.junit.Assert.*;


public class TestMapGetLoc extends TestCase{
	
	public void testMapGetLoc() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		Map map = frame.getMap();
		frame.addGhost(new Location(1,1), "Luke", Color.red);
		frame.addPacMan(new Location(3,3));

		assertTrue(map.getLoc(new Location (1,1)).contains(Map.Type.GHOST)); 
		assertTrue(map.getLoc(new Location (3,3)).contains(Map.Type.PACMAN));
		assertFalse(map.getLoc(new Location (3,3)).contains(Map.Type.GHOST));
	}
}
