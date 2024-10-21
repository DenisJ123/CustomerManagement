package ie.atu.customermanagement;

import java.util.List;

@org.springframework.stereotype.Service
public class CustomerService {
    private CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository)
    {
        this.customerRepository = customerRepository;
    }

    public List<CustomerProduct>add(CustomerProduct customerProduct)
    {
        customerRepository.save(CustomerProduct);
                final.Customer;
    }

    public String update(long id) {
        return null;
    }
}
