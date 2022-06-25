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

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CustomerDTO {
    @Id
    private String id;
    private String name;
    private String address;
    private double salary;
}
