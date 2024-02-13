package LearnFakeObjects;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BookingMangerTest {
	@Mock
	HotelService mockHotelser;
	
	List<String> availableRooms;
	@InjectMocks
	BookingManger bookingManger;
	
//	@Before
//	public void setUp() throws SQLException{
//		mockHotelser=Mockito.mock(HotelService.class);
//		bookingManger =new BookingManger(mockHotelser);
//		availableRooms=Arrays.asList("A","C","D");
//		
//	}
	
	@Before
	public void setUp() throws SQLException{
//		mockHotelser=Mockito.mock(HotelService.class);
//		bookingManger =new BookingManger(mockHotelser);
		availableRooms=Arrays.asList("A","C","D");
		
	}
	
	@Test
	public void CheckAvailabilityRoomsTrue() throws SQLException {
		when(mockHotelser.fetchAvailableRooms()).thenReturn(availableRooms);
		assertTrue(bookingManger.checkRoomAvailability("A"));
	}
	@Test
	public void CheckAvailabilityRoomsFalse() throws SQLException {
		when(mockHotelser.fetchAvailableRooms()).thenReturn(availableRooms);
		assertFalse(bookingManger.checkRoomAvailability("B"));
	}
	
	
//@Test
//public void CheckAvailabilityRoomsTrue() throws SQLException {
//	HotelService mockHotelser = Mockito.mock(HotelService.class);
//	BookingManger bookingManger =new BookingManger(mockHotelser);
//	availableRooms=Arrays.asList("A","C","D");
//	when(mockHotelser.fetchAvailableRooms()).thenReturn(availableRooms);
//	assertTrue(bookingManger.checkRoomAvailability("A"));
//}
	

}
