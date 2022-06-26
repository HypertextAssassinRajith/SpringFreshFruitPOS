package lk.freshfruit.POS.controller;

import lk.freshfruit.POS.dto.CustomerDTO;
import lk.freshfruit.POS.entity.Customer;
import lk.freshfruit.POS.service.CustomerService;
import lk.freshfruit.POS.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @ResponseStatus(HttpStatus.CREATED) //201
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveCustomer(@ModelAttribute CustomerDTO dto){ // modelattribute annotation not important!
        customerService.saveCustomer(dto);
        return new ResponseUtil(200,"Customer : "+dto.getId()+" is Successfully Saved",null);
    }

    @GetMapping()
    public ResponseUtil getAllCustomers(){
        return new ResponseUtil(200,"Done!",customerService.getAllCustomers());
    }

    @DeleteMapping(params = {"id"})
    public ResponseUtil deleteCustomer(@RequestParam String id){ //requestsparam annotation not important!
        customerService.deleteCustomer(id);
        return new ResponseUtil(200,"Customer : "+id+" is Deleted!!",null);
    }

    @PutMapping
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO dto){ //requestsbody annotation is important!
        customerService.updateCustomer(dto);
        return new ResponseUtil(200,"Customer : "+dto.getId()+" Updated!!",null);
    }
}
