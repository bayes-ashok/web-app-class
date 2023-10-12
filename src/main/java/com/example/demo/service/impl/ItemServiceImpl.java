package com.example.demo.service.impl;

import com.example.demo.Pojo.ItemPojo;
import com.example.demo.entity.Item;
import com.example.demo.service.ItemService;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class ItemServiceimpl implements ItemService {
    public void saveItem(ItemPojo itemPojo) {
        Item item = new Item();

        if (itemPojo.getId() != null) {
            item = itemRepository.findById(itemPojo.getId())
                    .orElseThrow(() -> new NoSuchElementException("No data found"));
        }

        item.setId(itemPojo.getId());
        item.setItemName(itemPojo.getItemName());
        item.setDescription(itemPojo.getDescription());
        item.setPrice(itemPojo.getPrice());

        itemRepository.save(item);
    }

    List<Item> getAllItems(){
        return userRepository.findAll();
    }
    Optional<Item> getItemById(Integer id){

    }
    void deleteItemById(Integer id){

    }
}
