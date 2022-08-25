package com.spring.spring_jpa.entity;

public class FixedDeposit extends Account {

    public FixedDeposit(double balance, double interest, AccountType accountType, double term) {
        super(balance, interest, accountType);
        super.setTerm(term);

    }


}
