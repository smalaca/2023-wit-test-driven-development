# Mars Rover
A Rover is going to be dropped onto the surface of Mars, and will be controlled remotely from Earth. You are writing the software to control it as follows:
* The Rover will be dropped at a known position on the planet
* A planet is mapped as a grid of squares, each one being a Martian Cubit.
* Due to design limitations, the Rover can only move forward. However, it can turn 90º to either the left or the right.
* It is controlled by sending strings of characters as follows:
  * F - move one unit forward one Martian Cubit
  * L - turn 90º to the left
  * R - turn 90º to the right
  * All other characters are ignored
  * Eg: F -> [1,0]  (x=x+1)
  * Eg: RF -> [0,1] (y=y+1)
  * Eg: LF -> [0,100] (y=y-1)
  * Eg: RRF -> [100,0] (x=x-1)
  * Eg: FLFFRF -> [2,-2]
* We know how large Mars is. Its surface area is 100x100 Cubits.
* Planets are round… (so take this into account when trundling around).

## Bonus 1
There are obstacles on Mars where the Rover cannot go. We can see some from Earth, and can send known positions to the Rover.
* The Rover is initialised with an array of known obstacle coordinates when it lands
* If a set of commands would cause the Rover to hit an obstacle, it will stop just before, abort the command sequence, and report it back to Earth

## Bonus 2
In addition to the obstacle map, the Rover has a sensor that will pick up whether the next immediate move will hit an obstacle. This should be checked before moving to make sure the Rover does not collide with anything, fall into a crater, or otherwise ruin its day.
* Allow the Rover to update itself with new obstacles, reporting them back to Earth
* If the Rover does not detect an obstacle when the obstacle map indicates there is one, remove it from the obstacles list, report it and continue

## Bonus 3
Allow the Rover to be used on other, different sized planets (not just 100x100 ones)

## MegaBonus
Allow the Rover to autonomously map a planet, and report details of all obstacles found.