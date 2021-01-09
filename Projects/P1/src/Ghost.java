import java.util.HashSet;
import java.util.ArrayList;

public class Ghost{
	String myName;
	Location myLoc;
	Map myMap;

	public Ghost(String name, Location loc, Map map) {
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

	public boolean is_pacman_in_range() { 
		if (this.myMap.getLoc(new Location(this.myLoc.x+1,this.myLoc.y)).contains(Map.Type.PACMAN)) {
			return true;
		}
		if (this.myMap.getLoc(new Location(this.myLoc.x-1,this.myLoc.y)).contains(Map.Type.PACMAN)) {
			return true;
		}
		if (this.myMap.getLoc(new Location(this.myLoc.x,this.myLoc.y+1)).contains(Map.Type.PACMAN)) {
			return true;
		}
		if (this.myMap.getLoc(new Location(this.myLoc.x,this.myLoc.y-1)).contains(Map.Type.PACMAN)) {
			return true;
		}
		return false;
	}

	public boolean attack() {
		return false;
	}
}
