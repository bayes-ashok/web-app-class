package com.example.demo.controller;

import com.example.demo.entity.Item;
import com.example.demo.service.ItemService;
import com.example.demo.Pojo.ItemPojo;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("item")
@RestController
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @PostMapping("/save")
    public String saveItem(@Valid @RequestBody ItemPojo itemPojo) {
        itemService.saveItem(itemPojo);
        return "Item created";
    }

    @GetMapping("/getAll")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/getById/{id}")
    public Optional<Item> getItemById(@PathVariable("id") Integer id) {
        return itemService.getItemById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteItemById(@PathVariable("id") Integer id) {
        itemService.deleteItemById(id);
    }
}
