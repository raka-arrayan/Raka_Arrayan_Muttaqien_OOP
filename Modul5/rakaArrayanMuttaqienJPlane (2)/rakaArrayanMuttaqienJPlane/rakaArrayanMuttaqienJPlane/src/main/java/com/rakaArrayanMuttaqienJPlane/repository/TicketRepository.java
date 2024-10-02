package com.rakaArrayanMuttaqienJPlane.repository;

import com.rakaArrayanMuttaqienJPlane.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public class TicketRepository {

    @Repository
    public interface PlaneRepository extends JpaRepository<Ticket, Long> {
        Ticket findFirstByCode(String code);
    }

}
