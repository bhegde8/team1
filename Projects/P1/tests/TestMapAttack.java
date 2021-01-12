import java.awt.Color;
import junit.framework.*;

public class TestMapAttack {

	public void testMapAttack() {
		NoFrame frame = new NoFrame();
		Map mymap = frame.getMap();
		PacMan pacman = frame.addPacMan(new Location(1,1));
		Ghost ghost1 = frame.addGhost(new Location(2,1), "Ghost1", Color.red);
		Ghost ghost2 = frame.addGhost(new Location(3,3), "Ghost2", Color.red);
		assertTrue(mymap.attack("Ghost1"));	
		assertFalse(mymap.attack("Ghost2"));
	}
}
