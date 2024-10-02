package com.rakaArrayanMuttaqienJPlane.service;

import com.rakaArrayanMuttaqienJPlane.Account;
import com.rakaArrayanMuttaqienJPlane.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account registerAccount(String username, String password) {
        Account user = new Account(username, password);
        return accountRepository.save(user);
    }

    public List<Account> getAllUsers() {
        return accountRepository.findAll();
    }

    public Account topUpBalance(Long accountId, String username, String password, int amount) {
       Account account = accountRepository.findById(accountId).orElseThrow(()->new RuntimeException("account not found"));
        if (!account.getUsername().equals(username) || !account.getPassword().equals(password)) {
            throw new RuntimeException("Invalid username or password");
        }
        account.setBalance(account.getBalance() + amount);

        accountRepository.save(account);

        return account;
    }
}
