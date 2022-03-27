package com.OSB;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.OSB.Model.Seat;
import com.OSB.Repository.SeatRepo;
import com.OSB.Service.SeatService;

/*@RunWith(SpringRunner.class)*/
@SpringBootTest
public class SeatTest {

	/*
	 * private static final String SeatAvailability = null;
	 */
	@MockBean
	private SeatRepo repository;

	@Autowired
	private SeatService service;

	@Test
	public void saveSeatAvailability() {
		Seat seatAvailability = new Seat( "chennai", 90);
		when(repository.save(seatAvailability)).thenReturn(seatAvailability);
		assertEquals(seatAvailability, service.addSeat(seatAvailability));
	}


	
	 /* @Test
	  
	  public void updateSeatAvailabilityByLocationId()
	  
	  {
	  
	  int locationId = 1;
	  
	  Optional <SeatAvailability> seat = Optional.of(new
	  SeatAvailability(2,"Electronic City",135));
	  when(repository.findByLocationId(locationId)).thenReturn(seat);
	  
	  assertEquals(seat,service.findByLocationId(locationId));
	  
	  
	  */
	  
	  
	  
	  
	  
	  
	  
		/*
		 * when(repository.findByLocationId(locationId)).thenReturn(
		 * Optional.of(Stream.of(new
		 * SeatAvailability(1,"kadapa",80)).collect(Collectors.toList())));
		 * 
		 * assertEquals(1,service.updateSeatAvailabilityByLocationId(locationId).size())
		 * ;
		 */
	  
	  
	  //}
	  
	  
	 

}
