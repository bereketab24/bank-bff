package com.bereketab.bank.bankbff;

import org.springframework.boot.SpringApplication;

public class TestBankBffApplication {

    public static void main(String[] args) {
        SpringApplication.from(BankBffApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
