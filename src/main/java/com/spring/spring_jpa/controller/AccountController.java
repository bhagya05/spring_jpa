package com.spring.spring_jpa.controller;

import com.spring.spring_jpa.dto.AccountResponseDTO;
import com.spring.spring_jpa.entity.Account;
import com.spring.spring_jpa.services.AccountService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author bhagyapurba
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private ModelMapper modelMapper;

//    @GetMapping("/{accountNumber}")
//    @ResponseBody
//    public AccountResponseDTO getAccount(@PathVariable("accountNumber") String accountNumber) {
//        Account account = accountService.getAccountByAccountNumber(accountNumber);
//        AccountResponseDTO accountResponseDTO = modelMapper.map(account, AccountResponseDTO.class);
//        return
//    }
}
