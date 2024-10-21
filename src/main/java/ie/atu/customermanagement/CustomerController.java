package ie.atu.customermanagement;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
    private List<Customer> customerList = new ArrayList<>();
    private CustomerService customerService;
    {
        this.customerService = customerService;
    }

    @GetMapping("/getCustomers")
    public list<Customer> getCustomers()
    {
        return customerList;
    }

    @PostMapping("/addCustomers")
    public ResponseEntity <list> addCustomers(@RequestBody Customers customers)
    {
        customerList = customerService.add(customers);
                return ResponseEntity.ok(customerList);
    }

    @PostMapping("/updateCustomers/{id}")
    public String updateCustomers(@PathVariable long id, @RequestBody CustomerProduct customerProduct)
    {
        return customerService.update(id);
    }
}
