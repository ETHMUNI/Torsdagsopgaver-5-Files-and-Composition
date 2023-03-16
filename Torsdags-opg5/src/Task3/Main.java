package Task3;

import java.util.ArrayList;

public class Main {

    public static int countLampsInBuilding(Building building1) {
        //Need to take the instantiated Building object and get the total number of lamps.
        //Take getter method getRooms() so we can take the arraylist from that getter method.
        // then we have to...
        int totalLamps = 0;
        for (Room r : building1.getRooms()) {
            totalLamps += r.getNumberOfLamps();
        }
        return totalLamps;
    }

    public static boolean isNormal(Building building1) {
        if(building1.getNumberOfFloors() > building1.getRooms().size()) {
            return true;
        } else {
            System.out.println("This is an odd building");
            return false;
        }
    }
    public static void main(String[] args) {
        Room room1 = new Room(1, 1, 1);
        Room room2 = new Room(2, 2, 2);
        Room room3 = new Room(3, 3,3);

        ArrayList<Room> rooms = new ArrayList();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building1 = new Building(rooms, 1,3,false);

        System.out.println("You have this many lamps: " + countLampsInBuilding(building1));
        isNormal(building1);
    }
}
