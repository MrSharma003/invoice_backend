package com.invoice.webservices.services;

import com.invoice.webservices.entity.Invoice;
import com.invoice.webservices.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Autowired
    private ItemRepository itemRepository;

    public List<Invoice> getItemRepository(String username){
        return itemRepository.findByUsername(username);
    }

}
