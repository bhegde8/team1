import junit.framework.*;
import java.awt.Color;
import java.io.*;
import static org.junit.Assert.*;

public class TestGhostMove extends TestCase {

	public void testGhostMove() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		Ghost ghost1 = frame.addGhost(new Location(2,1), "Ghost1", Color.red);
		assertTrue(ghost1.move());
	}
}
