package lk.freshfruit.POS.controller;

import lk.freshfruit.POS.dto.CustomerDTO;
import lk.freshfruit.POS.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : Rajith Sanjaya
 * @project : SpringFreshFruitPOS
 * @created : 2022 June 25
 **/

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping
    public void saveCustomer(@ModelAttribute CustomerDTO dto){
        customerService.saveCustomer(dto);
    }

    @GetMapping()
    public List<CustomerDTO> getAllCustomers(){
        return customerService.getAllCustomers();
    }
}
