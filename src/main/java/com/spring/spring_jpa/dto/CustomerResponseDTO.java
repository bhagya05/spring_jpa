package com.spring.spring_jpa.dto;

import com.spring.spring_jpa.entity.Account;
import com.spring.spring_jpa.utils.Utils;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.List;

/**
 * @author bhagyapurba
 */
public class CustomerResponseDTO {
    private String customerId;
    private String name;
    private String contact;
    private String emailId;

    private List<Account> accounts;


    public CustomerResponseDTO() {
    }

    public CustomerResponseDTO(String name, String contact, String emailId) {
        this.name = name;
        this.contact = contact;
        this.emailId = emailId;
        this.customerId = Utils.generateCustomerId();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
