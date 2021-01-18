import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map {

	public enum Type {
		EMPTY, PACMAN, GHOST, WALL, COOKIE
	}

	private HashMap<Location, HashSet<Type>> field;
	private boolean gameOver;
	private int dim;

	private HashMap<String, Location> locations;
	private HashMap<String, JComponent> components;
	private HashSet<Type> emptySet;
	private HashSet<Type> wallSet;

	private int cookies = 0;

	public Map(int dim) {
		gameOver = false;
		locations = new HashMap<String, Location>();
		components = new HashMap<String, JComponent>();
		field = new HashMap<Location, HashSet<Type>>();

		emptySet = new HashSet<Type>();
		wallSet = new HashSet<Type>();
		emptySet.add(Type.EMPTY);
		wallSet.add(Type.WALL);
		this.dim = dim;
	}

	public void add(String name, Location loc, JComponent comp, Type type) {
		locations.put(name, loc);
		components.put(name, comp);
		if (!field.containsKey(loc))
			field.put(loc, new HashSet<Type>());
		field.get(loc).add(type);
	}

	public int getCookies() {
		return cookies;
	}

	public boolean isGameOver() {
		return gameOver;
	}

	public boolean move(String name, Location loc, Type type) {
		// update locations, components, and field
		// use the setLocation method for the component to move it to the new location

		Location old = locations.get(name);
		if (type == Type.PACMAN) {
			if (!getLoc(loc).contains(Type.WALL)) {
				PacMan pacman = new PacMan(name, old, this);
				locations.put(name, loc);
				components.get(name).setLocation(loc.x, loc.y);
				field.get(loc).add(type);
				return true;
			}
			return false;
		}

		if (type == Type.GHOST) {
			if (!getLoc(loc).contains(Type.WALL)) {
				Ghost ghost = new Ghost(name, old, this);
				locations.put(name, loc);
				components.get(name).setLocation(loc.x, loc.y);
				field.get(loc).add(type);
				return true;
			}
			return false;
		}

		return false;
	}

	public HashSet<Type> getLoc(Location loc) {
		// wallSet and emptySet will help you write this method

		if (loc.x < 0 || loc.y < 0 || loc.x >= dim || loc.y >= dim) {
			return wallSet;
		}

		if (!field.containsKey(loc)) {
			return emptySet;
		}

		return field.get(loc);
	}

	public boolean attack(String Name) {
		// update gameOver
		Location loc = locations.get(Name);
		Ghost gh = new Ghost(Name, loc, this);
		return true;

	}

	public JComponent eatCookie(String name) {
		// update locations, components, field, and cookies
		// the id for a cookie at (10, 1) is tok_x10_y1
		if(locations.containsKey(name)) {
			Location loc = locations.get(name);
			String tokid = "tok_x" + loc.x + "_y" + loc.y;
	
			field.get(loc).remove(Type.COOKIE);
			locations.remove(tokid);
			cookies++;
			return components.remove(tokid);
		} else {
			return null;
		}
		
		
	}
}
