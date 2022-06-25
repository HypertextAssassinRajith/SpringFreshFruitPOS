package lk.freshfruit.POS.service.impl;

import lk.freshfruit.POS.dto.ItemDTO;
import lk.freshfruit.POS.entity.Item;
import lk.freshfruit.POS.repo.ItemRepo;
import lk.freshfruit.POS.service.ItemService;
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
public class ItemServiceImpl implements ItemService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    ItemRepo itemRepo;

    @Override
    public void saveItem(ItemDTO dto) {
        Item item = modelMapper.map(dto, Item.class);
        itemRepo.save(item);
    }

    @Override
    public List<ItemDTO> getAllItems() {
        List<Item> all = itemRepo.findAll();
        Type type = new TypeToken<List<ItemDTO>>() {}.getType();
        return modelMapper.map(all,type);
    }
}
