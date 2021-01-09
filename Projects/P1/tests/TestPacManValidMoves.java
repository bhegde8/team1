import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManValidMoves extends TestCase {

	public void testPacManValidMoves() throws FileNotFoundException{
		Mainframe frame = new MainFrame();
		PacMan pacman = frame.addPacMan(new Location(2, 2));
		Ghost ghost = frame.addGhost(new Location(6, 6), "g1", Color.red);
		frame.startGame();
		Arraylist<Location> expected = {new Location(3,2),new Location(2,3)};
		assertEquals(expected, pacman.get_valid_moves());
		
	}
}
