package com.spring.spring_jpa.services;

import com.spring.spring_jpa.entity.Account;
import com.spring.spring_jpa.entity.Customer;
import com.spring.spring_jpa.repository.AccountRepository;
import com.spring.spring_jpa.repository.CustomerRepository;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;


    public Account getAccountByAccountNumber(String accountNumber)
    {
        Optional<Account>optional = accountRepository.findById(accountNumber);
        if(optional.isEmpty())
        {
            System.out.println("Not found");
        }
        return optional.get();
    }
    public Account createAccount(Account account)
    {
        return accountRepository.save(account);
    }

    public boolean credit(String accountNumber,double amount)
    {

            Optional<Account>optional = accountRepository.findById(accountNumber);
            if(optional.isEmpty())
            {
                System.out.println("Account not found");
                return false;
            }
            Account account = optional.get();
            account.setBalance(account.getBalance() + amount);
            accountRepository.save(account);
            return true;

    }
    public boolean debit(String accountNumber,double amount)
    {

        Optional<Account>optional = accountRepository.findById(accountNumber);
        if(optional.isEmpty())
        {
            System.out.println("Account not found");
            return false;
        }
        Account account = optional.get();
        if(account.getBalance() < amount)
        {
            System.out.println("You don't have enough balance");
            return false;
        }
        account.setBalance(account.getBalance() - amount);
        accountRepository.save(account);
        return true;

    }

}
