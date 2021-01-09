import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan{
	String myName;
	Location myLoc;
	Map myMap;
	Location shift; 

	public PacMan(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		return null;	
	}

	public boolean move() {
		return false;
	}

	public boolean is_ghost_in_range() { 
		if (this.myMap.getLoc(new Location(this.myLoc.x + 1, this.myLoc.y)).contains(Map.Type.GHOST)){
			return true;
		}
		if (this.myMap.getLoc(new Location(this.myLoc.x - 1, this.myLoc.y)).contains(Map.Type.GHOST)){
			return true;
		}
		if (this.myMap.getLoc(new Location(this.myLoc.x, this.myLoc.y + 1)).contains(Map.Type.GHOST)){
			return true;
		}
		if (this.myMap.getLoc(new Location(this.myLoc.x, this.myLoc.y - 1)).contains(Map.Type.GHOST)){
			return true;
		}
		return false;
	}

	public JComponent consume() { 
 		return null;
	}
}
