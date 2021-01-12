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
		ArrayList<Location> locs = new ArrayList<Location>();

		if(!myMap.getLoc(myLoc.shift(0, 1)).contains(Map.Type.WALL)){
			locs.add(myLoc.shift(0, 1));
		}
		if(!myMap.getLoc(myLoc.shift(0, -1)).contains(Map.Type.WALL)){
			locs.add(myLoc.shift(0, -1));
		}
		if(!myMap.getLoc(myLoc.shift(1, 0)).contains(Map.Type.WALL)){
			locs.add(myLoc.shift(1, 0));
		}
		if(!myMap.getLoc(myLoc.shift(-1, 0)).contains(Map.Type.WALL)){
			locs.add(myLoc.shift(-1, 0));
		}
		return locs;
	}

	public boolean move() {
		ArrayList<Location> locs = get_valid_moves();

		if(locs.isEmpty()){
			return false;
		}
		myLoc = locs.get(0);
		return true;
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
		if (is_pacman_in_range()) {
			return true;
		}
		return false;
	}
}
