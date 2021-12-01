package Rooms;

import java.util.ArrayList;


public class Room {

    private ArrayList<BookedTime> bookTime;
    private int roomCapacity;
    private String roomId;
    private boolean foldable;

    public Room(int roomCapacity, String roomId, boolean foldable) {
        this.bookTime = new ArrayList<>();
        this.roomCapacity = roomCapacity;
        this.roomId = roomId;
        this.foldable = foldable;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }


    public String getRoomId() {
        return roomId;
    }

    public boolean isFoldable() {
        return foldable;
    }
    public void addNewBooking(BookedTime bookedTime){
        bookTime.add(bookedTime);
    }

    public void cancelBooking(BookedTime bookedTime){
        bookTime.remove(bookedTime);
    }
    public ArrayList<BookedTime> getBookedDates(){
        return bookTime;
    }
    public boolean isAvailable(BookedTime bookedTime){

            for (BookedTime time:bookTime) {
                DateTime start = time.getStart();
                DateTime end = time.getEnd();

                if ((bookedTime.getStart().isBefore(end) && bookedTime.getStart().isAfter(start))
                        || (bookedTime.getEnd().isBefore(end) && bookedTime.getEnd().isAfter(start))
                        || (bookedTime.getStart().isBefore(start) && bookedTime.getEnd().isAfter(end))
                || bookedTime.getStart().equals(start) || bookedTime.getEnd().equals(end)) {
                    return false;
                }
            }
            return true;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;

        Room room = (Room) o;

        if (roomCapacity != room.roomCapacity) return false;
        if (foldable != room.foldable) return false;
        if (bookTime != null ? !bookTime.equals(room.bookTime) : room.bookTime != null) return false;
        return roomId != null ? roomId.equals(room.roomId) : room.roomId == null;
    }


    public String toString() {
        return "Room "+ roomId +", room capacity: " + roomCapacity +", foldable: " + foldable +", book time: " + bookTime;
    }
}
