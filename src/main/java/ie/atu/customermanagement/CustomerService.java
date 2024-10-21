package ie.atu.customermanagement;

import java.util.List;

@org.springframework.stereotype.Service
public class CustomerService {
    private CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository)
    {
        this.customerRepository = customerRepository
    }

    public List<Customer>add(Customer customer)
    {
        customerRepository.save(Customer)
                final.Customer customer;
    }
}
