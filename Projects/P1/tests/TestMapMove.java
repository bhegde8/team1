import junit.framework.*;
import java.awt.Color;
import java.io.*;
import static org.junit.Assert.*;

public class TestMapMove extends TestCase{

	public void testMapMove() throws FileNotFoundException {
		
		NoFrame frame = new NoFrame();
		Map map = frame.getMap();
		Ghost ghost1 = frame.addGhost(new Location(1,1), "Ghost1", Color.red);	
		Ghost ghost2 = frame.addGhost(new Location(1,1), "Ghost2", Color.red);	
		assertTrue(map.move("Ghost1", new Location (2,1), Map.Type.GHOST));
		assertFalse(map.move("Ghost2", new Location (2,2), Map.Type.GHOST));
	}
}
