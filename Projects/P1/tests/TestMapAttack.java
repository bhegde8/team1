import java.awt.Color;
import junit.framework.*;
import java.io.*;
import static org.junit.Assert.*;

public class TestMapAttack extends TestCase{

	public void testMapAttack() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		Map mymap = frame.getMap();
		frame.addPacMan(new Location(1,1));
		frame.addGhost(new Location(2,1), "Ghost1", Color.red);
		frame.addGhost(new Location(3,3), "Ghost2", Color.red);
		assertTrue(mymap.attack("Ghost1"));	
		
	}
}
