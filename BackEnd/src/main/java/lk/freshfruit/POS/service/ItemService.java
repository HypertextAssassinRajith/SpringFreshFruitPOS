package lk.freshfruit.POS.service;

import lk.freshfruit.POS.dto.ItemDTO;

import java.util.List;

/**
 * @author : Rajith Sanjaya
 * @project : SpringFreshFruitPOS
 * @created : 2022 June 25
 **/
public interface ItemService {
    public void saveItem(ItemDTO dto);

    public List<ItemDTO> getAllItems();

    public void deleteItem(String code);

    public void updateItem(ItemDTO dto);
}
