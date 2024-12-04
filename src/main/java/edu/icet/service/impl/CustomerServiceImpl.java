package edu.icet.service.impl;

import edu.icet.dto.Customer;
import edu.icet.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public List<Customer> getAll() {
        return List.of();
    }

    @Override
    public void addCustomer(Customer customer) {

    }

    @Override
    public void deleteCustomerById(Integer id) {

    }

    @Override
    public Customer searchCustomerById(Integer id) {
        return null;
    }

    @Override
    public void updateCustomerById(Customer customer) {

    }
}
