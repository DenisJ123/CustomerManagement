package ie.atu.customermanagement;

import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerProduct, Long>
{
    CustomerProduct findByCustomerCode(int customerCode);
}
