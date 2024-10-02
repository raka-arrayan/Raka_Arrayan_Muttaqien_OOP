package com.rakaArrayanMuttaqienJPlane.service;

import com.rakaArrayanMuttaqienJPlane.Ticket;
import com.rakaArrayanMuttaqienJPlane.Plane;
import com.rakaArrayanMuttaqienJPlane.Account;
import com.rakaArrayanMuttaqienJPlane.repository.TicketRepository;
import com.rakaArrayanMuttaqienJPlane.repository.PlaneRepository;
import com.rakaArrayanMuttaqienJPlane.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private PlaneRepository planeRepository;

    @Autowired
    private AccountRepository accountRepository;

    // Method untuk mendapatkan tiket berdasarkan ID
    public Ticket getTicket(Long ticketID) {
        Ticket ticket = ticketRepository.findById(ticketID)
                .orElseThrow(() -> new RuntimeException("Ticket not found"));
        return ticket;
    }

    // Method untuk mendapatkan semua tiket
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    public Ticket bookTicket(Long buyerId, Long planeId, String code) {
        Plane plane = planeRepository.findById(planeId)
                .orElseThrow(()-> new RuntimeException("Plane tidak ditemukan"));
        Account buyer = accountRepository.findById(buyerId)
                .orElseThrow(()-> new RuntimeException("Plane tidak ditemukan"));

        Ticket ticket = new Ticket(buyer, plane, code);

        buyer.setBalance(buyer.getBalance() - 100000);

        ticketRepository.save(ticket);
        accountRepository.save(buyer);

        return ticket;
    }
}
