package lk.freshfruit.POS.service.impl;

import lk.freshfruit.POS.dto.ItemDTO;
import lk.freshfruit.POS.entity.Item;
import lk.freshfruit.POS.repo.ItemRepo;
import lk.freshfruit.POS.service.ItemService;
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
public class ItemServiceImpl implements ItemService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    ItemRepo itemRepo;

    @Override
    public void saveItem(ItemDTO dto) {
        if (!itemRepo.existsById(dto.getCode())){
            Item item = modelMapper.map(dto, Item.class);
            itemRepo.save(item);
        }else {
            throw new RuntimeException("Item : "+dto.getCode()+" , Already Exists!!");
        }
    }

    @Override
    public List<ItemDTO> getAllItems() {
        List<Item> all = itemRepo.findAll();
        Type type = new TypeToken<List<ItemDTO>>() {
        }.getType();
        return modelMapper.map(all, type);
    }

    @Override
    public void deleteItem(String code) {
        if (itemRepo.existsById(code)){
            itemRepo.deleteById(code);
        }else {
            throw new RuntimeException("No such Item By Code : "+code+" , Exists!!");
        }
    }

    @Override
    public void updateItem(ItemDTO dto) {
        if (itemRepo.existsById(dto.getCode())){
            Item item = modelMapper.map(dto, Item.class);
            itemRepo.save(item);
        }else {
            throw new RuntimeException("There are No Item To Update By Code : "+dto.getCode());
        }
    }
}
