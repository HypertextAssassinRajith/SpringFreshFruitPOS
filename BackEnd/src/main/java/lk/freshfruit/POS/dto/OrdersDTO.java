package lk.freshfruit.POS.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author : Rajith Sanjaya
 * @project : SpringFreshFruitPOS
 * @created : 2022 June 28
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class OrdersDTO{
    private String orderId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String date;
    private CustomerDTO customer;
    private double total;
}
