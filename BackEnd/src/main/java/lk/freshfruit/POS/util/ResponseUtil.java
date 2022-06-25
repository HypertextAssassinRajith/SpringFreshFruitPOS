package lk.freshfruit.POS.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : Rajith Sanjaya
 * @project : SpringFreshFruitPOS
 * @created : 2022 June 25
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ResponseUtil {
   private int code;
   private String message;
   private Object data;
}
