package com.mridul.hospital.hospitalmutimodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class HospitalmutimoduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalmutimoduleApplication.class, args);
    }

}
