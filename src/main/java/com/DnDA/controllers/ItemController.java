package com.DnDA.controllers;

import com.DnDA.models.Item;
import com.DnDA.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController {

    @Autowired
    ItemService itemService;

    @PostMapping
    public void saveItem(@RequestBody Item item){
        itemService.saveItem(item);
    }

    @GetMapping
    public Item getItem(@RequestParam long id){
        return itemService.getItem(id);
    }

    @PutMapping
    public Item updateItem(@RequestParam long id, @RequestBody Item item){
        return itemService.updateItem(id, item);
    }

    @DeleteMapping
    public void deleteItem(@RequestParam long id){
        itemService.deleteItem(id);
    }

}
