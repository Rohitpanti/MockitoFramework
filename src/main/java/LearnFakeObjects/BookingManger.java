package LearnFakeObjects;

import java.sql.SQLException;
import java.util.List;

public class BookingManger {
	private HotelService service;
	 
    public BookingManger(HotelService service) {
        this.service = service;
    }
 
    public boolean checkRoomAvailability(String roomName) throws SQLException {
 
        List<String> roomsAvailable = service.fetchAvailableRooms();
        return roomsAvailable.contains(roomName);
    }

}
