package edu.icet.service;

import edu.icet.dto.Item;

import java.util.List;

public interface ItemService {
    List<Item> getAll();
    void addItem(Item item);
    void deleteItemtyById(Integer id);
    Item searchItemById(Integer id);
    void updateItemById(Item item);
}
