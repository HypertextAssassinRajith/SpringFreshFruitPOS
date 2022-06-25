package lk.freshfruit.POS.repo;

import lk.freshfruit.POS.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Rajith Sanjaya
 * @project : SpringFreshFruitPOS
 * @created : 2022 June 25
 **/
public interface ItemRepo extends JpaRepository<Item,String> {
}
