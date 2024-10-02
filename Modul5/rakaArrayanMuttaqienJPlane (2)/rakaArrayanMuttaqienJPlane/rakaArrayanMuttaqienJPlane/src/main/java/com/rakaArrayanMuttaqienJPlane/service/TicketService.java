package com.rakaArrayanMuttaqienJPlane.service;

import com.rakaArrayanMuttaqienJPlane.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import com.rakaArrayanMuttaqienJPlane.repository.TicketRepository;
import com.rakaArrayanMuttaqienJPlane.repository.PlaneRepository;
import com.rakaArrayanMuttaqienJPlane.repository.AccountRepository;

public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private  PlaneRepository planeRepository;


    @Autowired
    private  AccountRepository accountRepository;

//    public Ticket getTicket(Long ticketID){
//        Ticket ticket = ticketRepository.findById(ticketID).orElseThrow(() -> new
//                RuntimeException("Ticket not found"));
//        return ticket;
//    }


//
//    public  List<Ticket> getTicket(Long ticketID){
//        Ticket ticket = ticketRepository.findById(ticketID).orElseThrow(() -> new
//                RuntimeException("Ticket not found"));
//        return ticket;
//    }

}
