package com.invoice.webservices;

import com.invoice.webservices.entity.Invoice;
import com.invoice.webservices.repo.ItemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ItemRepositoryTest {
    @Autowired
    private ItemRepository itemRepository;
    @Test
    void findByUsername() {
        List<Invoice> li=itemRepository.findByUsername("prasahnt");
        for(int i=0;i<li.size();i++){
            System.out.println(i);
            System.out.println(li.get(i));
        }
        assertThat(li).isNotNull();
    }
}