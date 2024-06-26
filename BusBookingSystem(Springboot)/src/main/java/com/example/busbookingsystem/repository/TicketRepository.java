package com.example.busbookingsystem.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.busbookingsystem.entity.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer>{

	List<Ticket> findByBusDetails_BusNumber(int busNumber);
	
	   @Query("SELECT COUNT(t) FROM Ticket t WHERE t.busDetails.busNumber = ?1")
	int countTicketsByBusNumber(int busNumber);
	
}
