
import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan {
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
		ArrayList<Location> moves = new ArrayList<Location>();
		ArrayList<Location> valid_moves = new ArrayList<Location>();
		moves.add(new Location(this.myLoc.x - 1, this.myLoc.y));
		moves.add(new Location(this.myLoc.x + 1, this.myLoc.y));
		moves.add(new Location(this.myLoc.x, this.myLoc.y - 1));
		moves.add(new Location(this.myLoc.x, this.myLoc.y + 1));
		moves.add(new Location(this.myLoc.x - 1, this.myLoc.y - 1));
		moves.add(new Location(this.myLoc.x + 1, this.myLoc.y + 1));
		moves.add(new Location(this.myLoc.x + 1, this.myLoc.y - 1));
		moves.add(new Location(this.myLoc.x - 1, this.myLoc.y + 1));

		for (Location move : moves) {
			if (this.myMap.getLoc(move).contains(Map.Type.EMPTY) || (this.myMap.getLoc(move).contains(Map.Type.COOKIE)
					&& !this.myMap.getLoc(move).contains(Map.Type.GHOST))) {
				valid_moves.add(move);
			}
		}

		return valid_moves;
	}

	public boolean move() {
		ArrayList<Location> locs = get_valid_moves();
		if (locs.size() == 0) {
			return false;
		}
		Location loc = locs.get(0);
		return myMap.move(myName, loc, Map.Type.PACMAN);
	}

	public boolean is_ghost_in_range() {
		if (this.myMap.getLoc(new Location(this.myLoc.x - 1, this.myLoc.y)).contains(Map.Type.GHOST)) {
			return true;
		}
		if (this.myMap.getLoc(new Location(this.myLoc.x, this.myLoc.y + 1)).contains(Map.Type.GHOST)) {
			return true;
		}
		if (this.myMap.getLoc(new Location(this.myLoc.x, this.myLoc.y - 1)).contains(Map.Type.GHOST)) {
			return true;
		}
		if (this.myMap.getLoc(new Location(this.myLoc.x + 1, this.myLoc.y - 1)).contains(Map.Type.GHOST)) {
			return true;
		}
		if (this.myMap.getLoc(new Location(this.myLoc.x - 1, this.myLoc.y - 1)).contains(Map.Type.GHOST)) {
			return true;
		}
		if (this.myMap.getLoc(new Location(this.myLoc.x - 1, this.myLoc.y + 1)).contains(Map.Type.GHOST)) {
			return true;
		}
		if (this.myMap.getLoc(new Location(this.myLoc.x + 1, this.myLoc.y + 1)).contains(Map.Type.GHOST)) {
			return true;
		}
		return true;
	}

	public JComponent consume() {
		if (this.myMap.getLoc(this.myLoc).contains(Map.Type.COOKIE)) {
			return new CookieComponent(1, 1, 1);
		}
		return new CookieComponent(1, 1, 1);
	}
}