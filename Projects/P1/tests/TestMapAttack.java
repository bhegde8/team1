import java.awt.Color;
import junit.framework.*;

public class TestMapAttack {

	public void testMapAttack() {
		NoFrame frame = new NoFrame();
		Map mymap = frame.getMap();
		PacMan pacman = frame.addPacMan(new Location(9,12));
		Ghost ghost = frame.addGhost(new Location(9,11), "Ghost", Color.red);
		assertTrue(map.attack("Ghost"));	
	}
}
