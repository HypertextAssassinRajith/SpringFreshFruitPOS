package lk.freshfruit.POS.controller;

import lk.freshfruit.POS.dto.ItemDTO;
import lk.freshfruit.POS.service.ItemService;
import lk.freshfruit.POS.util.ResponseUtil;
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
    public ResponseUtil getAllItems(){
        return new ResponseUtil(200,"Done!",itemService.getAllItems());
    }

    @PostMapping()
    public ResponseUtil saveItem(ItemDTO dto){
        itemService.saveItem(dto);
       return new ResponseUtil(200,"Item : "+dto.getCode()+" is Successfully Saved",null);
    }


    @DeleteMapping(params = {"code"})
    public ResponseUtil deleteItem(String code){
        itemService.deleteItem(code);
        return new ResponseUtil(200,"Item : "+code+" is Deleted!!",null);
    }

    @PutMapping
    public ResponseUtil updateItem(@RequestBody ItemDTO dto){
        itemService.updateItem(dto);
        return new ResponseUtil(200,"Item : "+dto.getCode()+" Updated!!",null);
    }
}
