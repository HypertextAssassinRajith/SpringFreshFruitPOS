package lk.freshfruit.POS.service.impl;

import lk.freshfruit.POS.dto.CustomerDTO;
import lk.freshfruit.POS.entity.Customer;
import lk.freshfruit.POS.repo.CustomerRepo;
import lk.freshfruit.POS.service.CustomerService;
import net.bytebuddy.description.method.MethodDescription;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Type;
import java.util.List;

/**
 * @author : Rajith Sanjaya
 * @project : SpringFreshFruitPOS
 * @created : 2022 June 25
 **/

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public void saveCustomer(CustomerDTO dto) {
        if (!customerRepo.existsById(dto.getId())){
            Customer entity = modelMapper.map(dto, Customer.class);
            customerRepo.save(entity);
        }else{
            throw new RuntimeException("Customer : "+dto.getId()+" , Already Exists!!");
        }

    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<Customer> all = customerRepo.findAll();
        Type type = new TypeToken<List<CustomerDTO>>() {}.getType();
        return modelMapper.map(all,type);
    }

    @Override
    public void deleteCustomer(String id) {
        if (customerRepo.existsById(id)){
            customerRepo.deleteById(id);
        }else {
            throw new RuntimeException("No such Customer By ID : "+id+" , Exists!!");
        }

    }

    @Override
    public void updateCustomer(CustomerDTO dto) {
        if (customerRepo.existsById(dto.getId())){
            Customer customer = modelMapper.map(dto, Customer.class);
            customerRepo.save(customer);
        }else{
            throw new RuntimeException("There are No Customer To Update By ID : "+dto.getId());
        }
    }
}
