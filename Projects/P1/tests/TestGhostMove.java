import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostMove extends TestCase {

	public void testGhostMove() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		Ghost ghost = frame.addGhost(new Location(9,11), "ghost1", Color.blue);	
		PacMan pacman = frame.addPacMan(new Location(7,10));
		assertTrue(ghost.move());
	}
}
