package lk.freshfruit.POS.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

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
public class Orders {
    @Id
    private String orderId;
    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "customerId",referencedColumnName = "id",nullable = false)
    private  Customer customer;
    private String date;
    private double total;
}
