# cmsc388t_winter21
CMSC388T Winter 21
Haley Greenspan
Vi Nguyen 
Xavier Warmerdam

# PacMan Simulation - Team 1, Project 1


Haley Greenspan,Xavier Warmerdam , Vi Nguyen


## Image of code playing PacMan

![Pacman game](https://github.com/viving11/CMSC388T-/blob/main/Pacman.png?raw=true)



## Instructions on running code

To start, run and compile the following files using the following commands and follow the menu:

```bash
javac -cp "src/" src/*.java
java -cp "src/" StartMenu
```

  


## Function & Test descriptions


## PacMan


### get_valid_moves()

-**Description**: This method returns all the valid moves that PacMan can make given his current position.

-**TestPacManValidMoves**: Inserts a PacMan at location (1,1). Based on map in assets, empty/cookie locations are at (2,1) and (1,2), so the expected valid moves should be those locations, in that order (according to how the method is written).


### move()

-**Description**: This method uses the get_valid_moves method to find the possible locations that PacMan can move, given his current location. The method then  chooses to move in one of those directions. You are free to apply an algorithm here if you would like, but the only requirement is that you move in a valid direction. If PacMan is able to move, this function returns true otherwise it returns false.

-**TestPacManMove**:This test checks if the pacman moves only in directions without walls.
  
  
### is_ghost_in_range() 

-**Description**: This method checks its surroundings to see if any Ghosts are in attack range. The attack radius of a ghost is 1 which means that a ghost at location <img src="https://render.githubusercontent.com/render/math?math=(x, y)">  can attack PacMan as long as PacMan is located at <img src="https://render.githubusercontent.com/render/math?math=(x \pm 1, y \pm 1)">. If any Ghosts are in the attack range, this method returns true otherwise it returns false.

-**TestGhostInRange**: The first two tests check if a PacMan at location (1,1) correctly determine a ghost is in range when the ghost is at location (1+1,1) and (1, 1+1). The third test correctly determines a ghost as (5,5) is not within range (outside of the +=1 radius).


### consume()

-**Description**: This method checks to see if there is a 'power-cookie' located in Pacman's current <img src="https://render.githubusercontent.com/render/math?math=(x, y)">  coordinate. If there is, this method calls the eatCookie method from the Map Class, and returns the cookie component if the cookie a consumed, and null otherwise.

-**TestConsume**: This test verifies that a cookie does not exist at the location (9,11).


## Ghost


### get_valid_moves()

-**Description**: This function returns an arraylist of possible locations that a ghost can move to from its current location. Ghosts cannot move through walls, but they can move through other ghosts or PacMan.

-**TestGhostValidMoves**: This tests that a ghost at location (1,1) can only move (x+-1, y+-1) if there is no wall. According to the map in assets, empty/cookies occur at (2,1) and (1,2).


### move() 

-**Description**: This function uses the get_valid_moves function to find the possible locations that a ghost can move to from its current location and chooses to move in one of those directions. You are free to apply an algorithm here if you would like, but the only requirement is that you move in a valid direction. If the ghost is able to move, this function returns true otherwise it returns false.

-**TestGhostMove**: This test checks if the ghost moves in only the directions without walls.
  
  
### is_pacman_in_range() 

-**Description**: This function checks its surroundings to see if PacMan is in attack range. The attack radius of a ghost is 1 which means that a ghost at location <img src="https://render.githubusercontent.com/render/math?math=(x, y)">  can attack PacMan as long as PacMan is located at <img src="https://render.githubusercontent.com/render/math?math=(x \pm 1, y \pm 1)">. If PacMan is in the attack range, this function returns true otherwise it returns false.

-**TestPacManInRange**: The first two tests check if a PacMan at location (1,1) can be determined to be in range when within a +=1 radius. Valid Ghost placement according to the map is (2,1) and (1,2), so the first two tests place a Ghost at the given locations and should be true. The third test verifies a Ghost at (4,4) does not detect the PacMan at (1,1) as in range. 

  
### attack()

-**Description**: This function checks to see if PacMan is in the attack range by using the is_pacman_in_range method and attacks PacMan if it is in range. This function returns true if the attack was successful and false otherwise.

**TestAttack**:This tests checks that the ghost successfully determines the pacman is in range and was attacked.


## Map 


### move(String name, Location loc, Type type) 

-**Description**: The method takes a name, location, and type and put the object specified by the name at the location. If the function is able to successfull move the object it returns true, otherwise it returns false.

-**TestMapMove**: This function tests that ghosts can correctly move into non-wall spaces, and cannot move into wall spaces within their movement radius.


### getLoc(Location loc)

-**Description**: For the given location argument, returns what is currently at the location (Empty, Pacman, Cookie, Ghost, Wall).

-**TestMapGetLoc**: This function tests that ghosts/pacmen are found where they are inserted and that they are not found where not inserted.


### attack(String name) 

-**Description**: The method controls ghosts attacking pacman. If the ghost was able to successfully attack pacman and update the display to do so return true, otherwise return false.

-**TestMapAttack**: This method verifies a ghost at (2,1) within the (1,1) pacman's radius can successfully attack, and that a ghost at (3,3) outside of the (1,1) pacman's radius is out of range so cannot attack.


### eatCookie(String Name)

-**Description**: This method controls Pacman eating a cookie. When the function is able to successfully update display to eat a cookie it returns the Cookie component that has been eaten, otherwise it returns null.

-**TestMapEatCookie**: This method tests that PacMan can eat the cookie at the PacMan's (1,1) location by making sure the method returns the cookie and not null.
