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
        Customer entity = modelMapper.map(dto, Customer.class);
        customerRepo.save(entity);
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<Customer> all = customerRepo.findAll();
        Type type = new TypeToken<List<CustomerDTO>>() {}.getType();
        return modelMapper.map(all,type);
    }
}
