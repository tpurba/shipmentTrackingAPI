package com.takun.shipmenttracker.controller;

import com.takun.shipmenttracker.model.Shipment;
import com.takun.shipmenttracker.repository.ShipmentRepository;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/shipments")
public class ShipmentController {

    private final ShipmentRepository shipmentRepository;

    public ShipmentController(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }

    @PostMapping
    public Shipment createShipment(@RequestBody Shipment shipment) {

        shipment.setTimestamp(LocalDateTime.now());

        return shipmentRepository.save(shipment);
    }

    @GetMapping
    public List<Shipment> getAllShipments() {
        return shipmentRepository.findAll();
    }
}