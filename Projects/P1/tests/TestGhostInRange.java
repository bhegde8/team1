import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class TestGhostInRange extends TestCase {

	public void testGhostInRange1() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(1, 1));		
		Ghost ghost = frame.addGhost(new Location(2, 1), "g1", Color.red);
		assertTrue(pacman.is_ghost_in_range());	
	}
	public void testGhostInRange2() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(1, 1));		
		Ghost ghost = frame.addGhost(new Location(1, 2), "g1", Color.red);
		assertTrue(pacman.is_ghost_in_range());	
	}
	public void testGhostInRange3() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(1, 1));		
		Ghost ghost = frame.addGhost(new Location(4, 4), "g1", Color.red);
		assertFalse(pacman.is_ghost_in_range());	
	}
}

