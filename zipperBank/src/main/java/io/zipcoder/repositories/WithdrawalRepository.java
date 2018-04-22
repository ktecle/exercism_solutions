package io.zipcoder.repositories;

import io.zipcoder.domain.Withdrawal;
import org.springframework.data.repository.CrudRepository;

public interface WithdrawalRepository extends CrudRepository<Withdrawal,Long> {
}
