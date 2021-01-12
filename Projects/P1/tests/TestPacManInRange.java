import junit.framework.*;
import java.awt.Color;
import java.io.*;
import static org.junit.Assert.*;

public class TestPacManInRange extends TestCase {

	public void testPacManInRange1() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(1, 1));		
		Ghost ghost = frame.addGhost(new Location(2, 1), "g1", Color.red);
		assertTrue(ghost.is_pacman_in_range());	
	}
	public void testPacManInRange2() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(1, 1));		
		Ghost ghost = frame.addGhost(new Location(1, 2), "g1", Color.red);
		assertTrue(ghost.is_pacman_in_range());	
	}
	public void testPacManInRange3() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(1, 1));		
		Ghost ghost = frame.addGhost(new Location(4, 4), "g1", Color.red);
		assertFalse(ghost.is_pacman_in_range());	
	}

}
