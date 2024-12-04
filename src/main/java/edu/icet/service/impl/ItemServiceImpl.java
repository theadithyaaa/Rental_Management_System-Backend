package edu.icet.service.impl;

import edu.icet.dto.Item;
import edu.icet.service.ItemService;

import java.util.List;

public class ItemServiceImpl implements ItemService {
    @Override
    public List<Item> getAll() {
        return List.of();
    }

    @Override
    public void addItem(Item item) {

    }

    @Override
    public void deleteItemtyById(Integer id) {

    }

    @Override
    public Item searchItemById(Integer id) {
        return null;
    }

    @Override
    public void updateItemById(Item item) {

    }
}
