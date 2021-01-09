import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

import javax.tools.DocumentationTool.Location;

public class TestPacManValidMoves extends TestCase {

	public void testPacManValidMoves() throws FileNotFoundException{
		Mainframe frame = new MainFrame();
		PacMan pacman = frame.addPacMan(new Location(1, 1));
		Ghost ghost = frame.addGhost(new Location(5, 5), "g1", Color.red);
		frame.startGame();
		ArrayList<Location> expected = new ArrayList<Location>();
		expected.add(new Location(2,1));
		expected.add(new Location(1,2));
		assertEquals(expected, pacman.get_valid_moves());
		
	}
}
