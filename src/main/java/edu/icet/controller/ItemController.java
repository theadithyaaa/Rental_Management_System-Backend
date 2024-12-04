package edu.icet.controller;

import edu.icet.dto.Item;
import edu.icet.service.ItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
public class ItemController {
    @Autowired
    final ItemService service;

    @GetMapping("/get-all")
    public List<Item> getCustomer(){
        return service.getAll();
    }

    @PostMapping("/add-item")
    public void addItem(@RequestBody Item item){
        log.info("updated-> {}",item);
        service.addItem(item);
    }

    @GetMapping("/search-by-id/{id}")
    public Item getItemById(@PathVariable Integer id){
        return service.searchItemById(id);
    }

    @DeleteMapping("/delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteItemById(@PathVariable Integer id){
        service.deleteItemtyById(id);
    }
    @PutMapping("/update-item")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateItem(@RequestBody Item item){
        service.updateItemById(item);
    }

}
