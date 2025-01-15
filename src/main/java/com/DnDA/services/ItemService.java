package com.DnDA.services;

import com.DnDA.exceptions.ItemNotFoundException;
import com.DnDA.models.Item;
import com.DnDA.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public void saveItem(Item item){
        itemRepository.save(item);
    }

    public Item getItem(long id){
        return itemRepository.findById(id)
                .orElseThrow(ItemNotFoundException::new);
    }

    public Item updateItem(long id, Item updatedItem){
        return itemRepository.findById(id)
                .map(existingItem -> {
                    existingItem.setName(updatedItem.getName());
                    existingItem.setEffects(updatedItem.getEffects());
                    existingItem.setType(updatedItem.getType());
                    existingItem.setRarity(updatedItem.getRarity());
                    existingItem.setOwnerId(updatedItem.getOwnerId());
                    return itemRepository.save(existingItem);

                }).orElseThrow(ItemNotFoundException::new);
    }

    public void deleteItem(long id){
        Item item = itemRepository.findById(id)
                .orElseThrow(ItemNotFoundException::new);
        itemRepository.delete(item);
    }

}
