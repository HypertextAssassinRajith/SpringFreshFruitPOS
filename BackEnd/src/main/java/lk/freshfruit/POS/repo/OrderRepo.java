package lk.freshfruit.POS.repo;

import lk.freshfruit.POS.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Rajith Sanjaya
 * @project : SpringFreshFruitPOS
 * @created : 2022 July 01
 **/
public interface OrderRepo extends JpaRepository<Orders,String> {
}
