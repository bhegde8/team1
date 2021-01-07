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
		ArrayList<Location> valid_moves = new ArrayList<Location>();
		valid_moves.add(new Location(this.myLoc.x - 1, this.myLoc.y));
		valid_moves.add(new Location(this.myLoc.x + 1, this.myLoc.y));
		valid_moves.add(new Location(this.myLoc.x, this.myLoc.y - 1));
		valid_moves.add(new Location(this.myLoc.x, this.myLoc.y + 1));
		
		for (Location move: valid_moves) {
			if (!this.myMap.getLoc(move).contains(Map.Type.EMPTY)) {
				if (!this.myMap.getLoc(move).contains(Map.Type.COOKIE)) {
					valid_moves.remove(move);
				}
			}
		}
		return valid_moves;	
	}

	public boolean move() {
		return false;
	}

	public boolean is_ghost_in_range() { 
		return false;
	}

	public JComponent consume() { 
 		return null;
	}
}
