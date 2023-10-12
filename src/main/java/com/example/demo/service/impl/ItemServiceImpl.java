package com.example.demo.service.impl;

import com.example.demo.Pojo.ItemPojo;
import com.example.demo.Repository.ItemRepository;
import com.example.demo.entity.Item;
import com.example.demo.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    private final ItemRepository itemRepository;

    @Override
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

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Optional<Item> getItemById(Integer id) {
        return itemRepository.findById(id);
    }

    @Override
    public void deleteItemById(Integer id) {
        itemRepository.deleteById(id);
    }
}
