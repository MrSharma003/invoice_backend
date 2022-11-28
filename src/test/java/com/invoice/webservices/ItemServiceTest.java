package com.invoice.webservices;

import com.invoice.webservices.repo.ItemRepository;
import com.invoice.webservices.services.ItemService;
import com.invoice.webservices.services.UserDetailsServices;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ItemServiceTest {

    @Mock
    ItemRepository itemRepository;

    ItemService itemService;

    @BeforeEach
    void setUp() {
        this.itemService=new ItemService(this.itemRepository);
    }

    @Test
    void getItemRepository() {
        itemService.getItemRepository("prasahnt");
        Mockito.verify(itemRepository).findByUsername("prasahnt123");
    }
}