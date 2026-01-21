package com.finusrreg.services;

import com.finusrreg.models.UserAccount;
import com.finusrreg.repositories.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private UserAccountRepository userAccountRepository;

    public void createAccount(AccountRequest request) {
        // Validate input
        // Hash password
        // Save to database
        UserAccount account = new UserAccount();
        account.setEmail(request.getEmail());
        account.setPasswordHash(hashPassword(request.getPassword()));
        account.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        userAccountRepository.save(account);
    }

    private String hashPassword(String password) {
        // Implement password hashing
        return password; // Placeholder
    }
}