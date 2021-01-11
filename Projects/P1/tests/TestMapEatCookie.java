import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapEatCookie {
	
	public void testMapEatCookie() {
		frame = new NoFrame();
		mymap = frame.getMap();
		frame.addPacMan(new Location(1,1));
		assertTrue(mymap.eatCookie("pacman") != null);
	}
}
