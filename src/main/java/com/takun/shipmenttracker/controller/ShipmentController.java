package com.takun.shipmenttracker.controller;

import com.takun.shipmenttracker.model.Shipment;
import com.takun.shipmenttracker.repository.ShipmentRepository;
import com.takun.shipmenttracker.service.MetricsService;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/shipments")
public class ShipmentController {

    private final ShipmentRepository shipmentRepository;
    private final MetricsService metricsService;
    public ShipmentController(ShipmentRepository shipmentRepository, MetricsService metricsService) {
        this.shipmentRepository = shipmentRepository;
        this.metricsService = metricsService;
    }
    

    @PostMapping
    public Shipment createShipment(@RequestBody Shipment shipment) {

        shipment.setTimestamp(LocalDateTime.now());
        Shipment savedShipment = shipmentRepository.save(shipment);

        metricsService.incrementShipmentCounter();

        return savedShipment;
    }

    @GetMapping
    public List<Shipment> getAllShipments() {
        return shipmentRepository.findAll();
    }
}