
package com.titan.travelagent;

import com.titan.domain.Customer;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;
import java.util.List;

@Stateless(name = "TravelAgentEJB")
public class TravelAgentBean {
    @PersistenceContext
    EntityManager entityManager;

    public TravelAgentBean() {
    }

    public Collection<Customer> getCustomers()
    {
        Query query = entityManager.createQuery("SELECT c FROM Customer AS c");
        @SuppressWarnings("unchecked")
        List<Customer> customers = query.getResultList();
        return customers;
    }

    public int createCustomer(Customer customer)
    {
        entityManager.persist(customer);
        entityManager.flush();
        return customer.getId();


    }


}
