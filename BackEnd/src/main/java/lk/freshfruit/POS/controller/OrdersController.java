package lk.freshfruit.POS.controller;

import lk.freshfruit.POS.dto.OrdersDTO;
import lk.freshfruit.POS.service.PlaceOrderService;
import lk.freshfruit.POS.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Rajith Sanjaya
 * @project : SpringFreshFruitPOS
 * @created : 2022 June 28
 **/

@RestController
@CrossOrigin
@RequestMapping("api/v1/orders")
public class OrdersController {

    @Autowired
    PlaceOrderService placeOrderService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil placeOder(@RequestBody OrdersDTO dto){
        System.out.println(dto.toString());
        placeOrderService.placeOrder(dto);
        return new ResponseUtil(200,"Order ID : "+dto.getOrderId()+" is Successfully placed",null);
    }
}
