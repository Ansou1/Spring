package com.ansou.springdemo.rest;

import com.ansou.springdemo.entity.Customer;
import com.ansou.springdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping("/customers/{customerID}")
    public Customer getCustomers(@PathVariable int customerID) {

        Customer theCustomer = customerService.getCustomer(customerID);

        if (theCustomer == null) {
            throw new CustomerNotFoundException("Customer haven't been found into the database for the id: " + customerID);
        }
        return theCustomer;
    }

    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer theCustomer) {
        theCustomer.setId(0);
        customerService.saveCustomer(theCustomer);
        return theCustomer;
    }

    @PutMapping("/customers")
    public Customer updateCustomer(@RequestBody Customer customer) {
        customerService.saveCustomer(customer);
        return customer;
    }

    @DeleteMapping("/customers/{customerID}")
    public String deleteCustomers(@PathVariable int customerID) {
        Customer theCustomer = customerService.getCustomer(customerID);

        if (theCustomer == null) {
            throw new CustomerNotFoundException("Customer haven't been found into the database for the id: " + customerID);
        }

        customerService.deleteCustomer(customerID);
        return "Deleted customer with the id: " + customerID;
    }


}
