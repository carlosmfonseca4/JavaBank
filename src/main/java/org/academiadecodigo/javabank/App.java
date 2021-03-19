package org.academiadecodigo.javabank;

import org.academiadecodigo.javabank.controller.Controller;
import org.academiadecodigo.javabank.services.AccountServiceDatabase;
import org.academiadecodigo.javabank.services.AuthServiceDatabase;
import org.academiadecodigo.javabank.services.CustomerServiceDatabase;
import org.academiadecodigo.javabank.services.useless.AccountServiceImpl;
import org.academiadecodigo.javabank.services.useless.AuthServiceImpl;
import org.academiadecodigo.javabank.services.useless.CustomerServiceImpl;

public class App {

    public static void main(String[] args) {

        App app = new App();
        app.bootStrap();
    }

    private void bootStrap() {

        Bootstrap bootstrap = new Bootstrap();
        bootstrap.setAuthService(new AuthServiceDatabase());
        bootstrap.setAccountService(new AccountServiceDatabase());
        bootstrap.setCustomerService(new CustomerServiceDatabase());
        bootstrap.loadCustomers();

        Controller controller = bootstrap.wireObjects();

        // start application
        controller.init();
    }
}
