import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManMove extends TestCase {

	public void testPacManMove() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		Ghost ghost = frame.addGhost(new Location(9,11), "ghost1", Color.blue);	
		PacMan pacman = frame.addPacMan(new Location(7,10));
		assertTrue(pacman.move());
	}
}
