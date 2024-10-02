package com.rakaArrayanMuttaqienJPlane;

import com.rakaArrayanMuttaqienJPlane.service.AccountService;
import com.rakaArrayanMuttaqienJPlane.service.TicketService;
import com.rakaArrayanMuttaqienJPlane.Ticket;
import com.rakaArrayanMuttaqienJPlane.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class RakaArrayanMuttaqienJPlaneApplication {

	public static void main(String[] args) {
		SpringApplication.run(RakaArrayanMuttaqienJPlaneApplication.class, args);
	}

	@Autowired
	private AccountService accountService;

	@Autowired
	private TicketService ticketService;

	@Bean
	public ApplicationRunner initializer() {
		return args -> {
			// Mendapatkan semua akun yang ada di database
			List<Account> accounts = accountService.getAllUsers();
			System.out.println("All accounts:");
			accounts.forEach(account -> System.out.println(account));

			// Top-up balance akun dengan ID 1, username "Netlab", dan password "myPassword"
			Account account = accountService.topUpBalance(20L, "rakaArrayan", "myPassword", 200000);

			// Booking tiket dengan buyerId (ID account), planeId 1, dan kode "KL000"
			Ticket ticket = ticketService.bookTicket(account.getId(), 1L, "KL800");
			System.out.println("Added ticket:");
			System.out.println(ticketService.getTicket(ticket.getId()));

			// Menampilkan semua tiket yang ada di database
			System.out.println("All tickets:");
			List<Ticket> tickets = ticketService.getAllTickets();
			tickets.forEach(x -> System.out.println(x));

			// Menampilkan semua akun setelah di-update
			List<Account> updatedAccounts = accountService.getAllUsers();
			System.out.println("All accounts updated:");
			updatedAccounts.forEach(x -> System.out.println(x));
		};
	}
}
