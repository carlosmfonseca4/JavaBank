package org.academiadecodigo.javabank.mvc;

import org.academiadecodigo.javabank.application.BankApplication;
import org.academiadecodigo.javabank.domain.Bank;

public class MainForTests {

    public static void main(String[] args) {

        Bank bank = new Bank();

        BankApplication bankApplication = new BankApplication(bank);

        bankApplication.start();
    }
}
