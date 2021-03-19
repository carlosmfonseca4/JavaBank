package org.academiadecodigo.javabank.services;

import org.academiadecodigo.javabank.model.Customer;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Set;

public class CustomerServiceDatabase implements CustomerService{

    EntityManagerFactory enf = Persistence.createEntityManagerFactory("javabank");


    @Override
    public Customer get(Integer id) {
        return null;
    }

    @Override
    public List<Customer> list() {
        return null;
    }

    @Override
    public Set<Integer> listCustomerAccountIds(Integer id) {
        return null;
    }

    @Override
    public double getBalance(int id) {
        return 0;
    }

    @Override
    public void add(Customer customer) {

    }
}
