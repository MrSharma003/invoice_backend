package com.invoice.webservices.repo;

import com.invoice.webservices.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository <Invoice, Long> {
    List<Invoice> findByUsername(String username);
}
