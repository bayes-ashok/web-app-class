package com.example.demo.service;

import com.example.demo.Pojo.ItemPojo;
import com.example.demo.entity.Item;

import java.util.List;
import java.util.Optional;

public interface ItemService {
    void saveItem(ItemPojo itemPojo);

    List<Item> getAllItems();

    Optional<Item> getItemById(Integer id);

    void deleteItemById(Integer id);
}
