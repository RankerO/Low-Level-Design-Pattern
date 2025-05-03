package ElevatorSystem.Self;

import ElevatorSystem.Self.Enum.Direction;
import ElevatorSystem.Self.Enum.Floor;

public class Display {
    Floor currFloor = null;
    Direction currDirection=null;
    public Display(Floor currFloor, Direction currDirection){
        this.currFloor=currFloor;
        this.currDirection=currDirection;
    }
}


