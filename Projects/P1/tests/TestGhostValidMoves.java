import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class TestGhostValidMoves extends TestCase {

	public void testGhostValidMoves() throws FileNotFoundException{
		NoFrame frame = new NoFrame();		
		Ghost ghost = frame.addGhost(new Location(5, 5), "ghost1", Color.red);
		PacMan pacman = frame.addPacMan(new Location(1, 1));
		ArrayList<Location> expected = new ArrayList<Location>();
		expected.add(new Location(2,1));
		expected.add(new Location(1,2));
		assertEquals(expected, ghost.get_valid_moves());
	}
}
