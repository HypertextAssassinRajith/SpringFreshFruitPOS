package lk.freshfruit.POS.service;

import lk.freshfruit.POS.dto.OrdersDTO;

/**
 * @author : Rajith Sanjaya
 * @project : SpringFreshFruitPOS
 * @created : 2022 July 01
 **/
public interface PlaceOrderService {

     public void placeOrder(OrdersDTO ordersDTO);

     public void getAllOrders(OrdersDTO ordersDTO);

     public void updateOrder(OrdersDTO ordersDTO);
}
