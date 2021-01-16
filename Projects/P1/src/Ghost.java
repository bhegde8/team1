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
			
		for (Location move: moves) {
			if ((this.myMap.getLoc(move).contains(Map.Type.WALL))) {
					valid_moves.add(move);
				}
			}
		
		return valid_moves;	
	}

	public boolean move() {
		ArrayList<Location> locs = get_valid_moves();
		if (locs.size() == 0){
			return false;
		}
		
		return myMap.move(myName, loc, Map.Type.GHOST);

	}

	public boolean is_pacman_in_range() { 
		if (this.myMap.getLoc(new Location(this.myLoc.x-1,this.myLoc.y)).contains(Map.Type.PACMAN)) {
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
		if (this.myMap.getLoc(new Location(this.myLoc.x-1,this.myLoc.y-1)).contains(Map.Type.PACMAN)) {
			return true;
		}
		if (this.myMap.getLoc(new Location(this.myLoc.x-1,this.myLoc.y+1)).contains(Map.Type.PACMAN)) {
			return true;
		}
		if (this.myMap.getLoc(new Location(this.myLoc.x+1,this.myLoc.y+1)).contains(Map.Type.PACMAN)) {
			return true;
		}
		if (this.myMap.getLoc(new Location(this.myLoc.x+1,this.myLoc.y-1)).contains(Map.Type.PACMAN)) {
			return true;
		}
		return true;
	}

	public boolean attack() {
		if (is_pacman_in_range() == false) {
			return myMap.attack(myName);
		}
		return false;
	}
}
