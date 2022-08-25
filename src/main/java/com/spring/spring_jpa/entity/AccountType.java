package com.spring.spring_jpa.entity;

import javax.persistence.Embeddable;

public enum AccountType {
    Savings("Saving"), FixedDeposit("FixedDeposit");
    private String code;

    private AccountType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
