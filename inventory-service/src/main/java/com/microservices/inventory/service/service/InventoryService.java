package com.microservices.inventory.service.service;

import com.microservices.inventory.service.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public boolean checkAvailability(String skuCode){
        return inventoryRepository.findBySkuCode(skuCode).isPresent();
    }

}
