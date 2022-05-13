package com.capg;

import static org.mockito.Mockito.when;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.capg.Model.Booking;
import com.capg.Repository.BookingRepo;
import com.capg.Service.BookingService;

@SpringBootTest
public class HomeMultiplexBookingSystemBookingTest{
	@MockBean
	private BookingRepo repository;
	@Autowired
	private BookingService service;
	@Test
	public void addBooking() {
	Booking booking = new Booking(26, "gold");
	when(repository.save(booking)).thenReturn(booking);
	assertEquals(booking, service.addBooking(booking));
		
		
	}
	private void assertEquals(Booking booking, Booking addBooking) {
		// TODO Auto-generated method stub
		
	}
	
	}
	