import junit.framework.*;
import java.awt.Color;
import java.io.*;
import org.junit.Assert.*;

public class TestAttack extends TestCase {

	public void testAttack() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		Ghost ghost = frame.addGhost(new Location(1,1), "binky", Color.red);	
		PacMan pacman = frame.addPacMan(new Location(2,1));
		assertTrue(ghost.attack());
	}
	}

