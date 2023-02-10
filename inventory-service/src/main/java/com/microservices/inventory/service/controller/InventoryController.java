package com.microservices.inventory.service.controller;

import com.microservices.inventory.service.dto.InventoryResponse;
import com.microservices.inventory.service.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> checkAvailability(@RequestParam List<String> skuCode){
        return inventoryService.checkAvailability(skuCode);
    }

}
