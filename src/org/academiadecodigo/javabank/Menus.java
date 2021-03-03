package org.academiadecodigo.javabank;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.domain.Customer;
import org.academiadecodigo.javabank.domain.account.AccountType;
import org.academiadecodigo.javabank.domain.account.CheckingAccount;
import org.academiadecodigo.javabank.managers.AccountManager;

public class Menus {

    AccountManager accountManager;
    AccountType accountType;
    Bank bank;
    Customer customer;
    CheckingAccount checkingAccount;
    Prompt prompt;

    public Menus(){

        accountManager = new AccountManager();
        bank = new Bank(accountManager);
        prompt = new Prompt(System.in, System.out);
        customer = new Customer();

    }

    public void mainMenu(){

        String[] options = {"View Balance", "Make Deposit", "Make Withdrawal", "Open Account", "Quit"};
        String message = "Welcome to Java Bank";

        switch (menuCreator(options, message)){

            case 1:
                viewBalance();
                break;
            case 2:
                makeDeposit();
                break;
            case 3:
                makeWithdrawal();
                break;
            case 4:
                openAccount();
                break;
            case 5:
                System.exit(0);
        }
        mainMenu();
    }

    public void viewBalance(){

        System.out.println(bank.getBalance());
    }

    public void makeDeposit(){

        checkingAccount = new CheckingAccount(checkingAccount.getId());
        StringInputScanner message1 = new StringInputScanner();
        message1.setMessage("Wou have the following accounts: " + checkingAccount );
        StringInputScanner message2 = new StringInputScanner();
        message2.setMessage("Please insert your account number: ");
        StringInputScanner message3 = new StringInputScanner();
        message3.setMessage("Please insert amount: ");
        accountManager.deposit();
    }

    public void makeWithdrawal(){

        if(bank.getBalance() > 0){
            System.out.println("Amount to withdrawl: ");
            accountManager.withdraw();
        }
        if(bank.getBalance() <= 0){
            System.out.println("Your account balance doesn't allow you to do that operation");
        }
    }

    public void openAccount(){

        accountManager.openAccount(accountType);
    }


    public int menuCreator(String[] options, String message){

        MenuInputScanner scaner = new MenuInputScanner(options);
        scaner.setMessage(message);
        return prompt.getUserInput(scaner);
    }
}
