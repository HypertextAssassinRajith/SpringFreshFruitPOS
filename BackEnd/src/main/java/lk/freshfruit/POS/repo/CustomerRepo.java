package lk.freshfruit.POS.repo;

import lk.freshfruit.POS.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Rajith Sanjaya
 * @project : SpringFreshFruitPOS
 * @created : 2022 June 25
 **/
public interface CustomerRepo extends JpaRepository<Customer,String> {

}
