package io.zipcoder.repositories;

import io.zipcoder.domain.Bill;
import org.springframework.data.repository.CrudRepository;

public interface BillRepository extends CrudRepository<Bill,Long>{
}
