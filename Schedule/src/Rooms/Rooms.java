package Rooms;

import java.util.ArrayList;

public class Rooms {

    private Room[] rooms;
    private int size;

    public Rooms(int size){
        this.rooms=new Room[size];
    }
    public ArrayList<Room> getRooms(){
        ArrayList<Room>roomsList=new ArrayList<>();
        for (int i=0;i< rooms.length;i++){
            if (!(rooms[i]==null)){
                roomsList.add(rooms[i]);
            }
        }
        return roomsList;
    }
    public void addRoom(Room room){
        for (int i=0;i<rooms.length;i++){
            if (!(rooms[i]==null)){
                rooms[i]=room;
                break;
            }
        }
    }




}
