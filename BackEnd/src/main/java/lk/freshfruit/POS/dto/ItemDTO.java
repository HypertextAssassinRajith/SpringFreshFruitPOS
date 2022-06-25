package lk.freshfruit.POS.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author : Rajith Sanjaya
 * @project : SpringFreshFruitPOS
 * @created : 2022 June 25
 **/


@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ItemDTO {
    @Id
    private String code;
    private String description;
    private int qtyAvailable;
    private double price;
}
