package lk.freshfruit.POS.service.impl;

import lk.freshfruit.POS.dto.OrdersDTO;
import lk.freshfruit.POS.entity.Orders;
import lk.freshfruit.POS.repo.OrderRepo;
import lk.freshfruit.POS.service.PlaceOrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : Rajith Sanjaya
 * @project : SpringFreshFruitPOS
 * @created : 2022 July 01
 **/

@Service
@Transactional
public class PlaceOrderServiceImpl implements PlaceOrderService {

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void placeOrder(OrdersDTO ordersDTO) {
        if (!orderRepo.existsById(ordersDTO.getOrderId())){
            Orders orders = modelMapper.map(ordersDTO, Orders.class);
            orderRepo.save(orders);
        }else {
            throw new RuntimeException("Order Form Order ID : "+ ordersDTO.getOrderId() +" is Already Exists !!");
        }
    }

    @Override
    public void getAllOrders(OrdersDTO ordersDTO) {

    }

    @Override
    public void updateOrder(OrdersDTO ordersDTO) {

    }
}
