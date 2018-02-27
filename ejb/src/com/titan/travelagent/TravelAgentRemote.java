package com.titan.travelagent;

import com.titan.domain.Customer;

import java.util.Collection;

public interface TravelAgentRemote {
    public Collection<Customer> getCustomer();
    int CreateCustomer(Customer customer);



}
