package io.zipcoder.repositories;

import io.zipcoder.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Long>{
}
