package lk.freshfruit.POS.controller;

import lk.freshfruit.POS.dto.ItemDTO;
import lk.freshfruit.POS.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : Rajith Sanjaya
 * @project : SpringFreshFruitPOS
 * @created : 2022 June 25
 **/
@RestController
@CrossOrigin
@RequestMapping("api/v1/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping
    public List<ItemDTO> getAllItems(){
        return itemService.getAllItems();
    }

    @PostMapping()
    public void saveItem(ItemDTO dto){
        itemService.saveItem(dto);
    }


    @DeleteMapping(params = {"code"})
    public void deleteItem(String code){
        itemService.deleteItem(code);
    }

    @PutMapping
    public void updateItem(@RequestBody ItemDTO dto){
        itemService.updateItem(dto);
    }
}
