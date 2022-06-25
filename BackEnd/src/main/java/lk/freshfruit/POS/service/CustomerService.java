package lk.freshfruit.POS.service;

import lk.freshfruit.POS.dto.CustomerDTO;

import java.util.List;

/**
 * @author : Rajith Sanjaya
 * @project : SpringFreshFruitPOS
 * @created : 2022 June 25
 **/
public interface CustomerService {

    public void saveCustomer(CustomerDTO dto);

    public List<CustomerDTO> getAllCustomers();
}
