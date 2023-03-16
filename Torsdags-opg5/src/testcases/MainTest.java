import Task3.Building;
import Task3.Room;

import java.util.ArrayList;
import static Task3.Main.countLampsInBuilding;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void countLampsInBuildingTest() {

        ArrayList<Room> rooms = new ArrayList();
        Room r1 = new Room(1, 1, 1);
        Room r2 = new Room(2, 2, 2);
        Room r3 = new Room(3, 3,3);
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);

        Building b1 = new Building(rooms, 1,3,false);
        countLampsInBuilding(b1);

        assertEquals(6, countLampsInBuilding(b1));
    }

    @org.junit.jupiter.api.Test
    boolean isNormalTest() {
        ArrayList<Room> rooms = new ArrayList();
        Room room1 = new Room(1, 1, 1);
        Room room2 = new Room(2, 2, 2);
        Room room3 = new Room(3, 3,3);
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        Building b1 = new Building(rooms, 1,3,false);

        if(b1.getNumberOfFloors() > b1.getRooms().size()) {
            return true;
        } else {
            System.out.println("This is an odd building");
            return false;
        }
        assertEquals(true, isNormalTest(b1));
    }
}