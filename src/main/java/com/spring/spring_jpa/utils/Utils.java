package com.spring.spring_jpa.utils;

import com.spring.spring_jpa.dto.CustomerRequestDTO;
import com.spring.spring_jpa.dto.CustomerResponseDTO;
import com.spring.spring_jpa.entity.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;


public class Utils {


    ModelMapper modelMapper;

    public static String generateCustomerId() {
        StringBuilder sb = new StringBuilder();
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            int x = rnd.nextInt(10);
            sb.append(x);
        }
        sb.append("HDFC");
        return sb.toString();
    }

    public static String generateAccountNumber() {
        StringBuilder sb = new StringBuilder();
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            int x = rnd.nextInt(10);
            sb.append(x);
        }
        return sb.toString();
    }


}
