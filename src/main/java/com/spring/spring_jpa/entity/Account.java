package com.spring.spring_jpa.entity;

import com.spring.spring_jpa.utils.Utils;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class Account {
    @Id
    private String accountNumber;
    private double balance;
    private double interest;
    private AccountType accountType;


    private double term;

    public Account() {
    }

    public Account(double balance, double interest, AccountType accountType) {
        this.balance = balance;
        this.interest = interest;
        this.accountType = accountType;
        this.accountNumber = Utils.generateAccountNumber();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    @Embedded
    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public double getTerm() {
        return term;
    }

    public void setTerm(double term) {
        this.term = term;
    }
}
