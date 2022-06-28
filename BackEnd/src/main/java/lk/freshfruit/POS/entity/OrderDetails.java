package lk.freshfruit.POS.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author : Rajith Sanjaya
 * @project : SpringFreshFruitPOS
 * @created : 2022 June 28
 **/

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class OrderDetails {
    @Id
    private String oId;
    private String itemCode;
    private int qty;
    private double price;
}
