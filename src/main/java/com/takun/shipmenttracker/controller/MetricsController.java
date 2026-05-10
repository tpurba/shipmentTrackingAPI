package com.takun.shipmenttracker.controller;

import com.takun.shipmenttracker.model.Shipment;
import com.takun.shipmenttracker.repository.ShipmentRepository;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/metrics")
public class MetricsController {

    private final ShipmentRepository shipmentRepository;

    public MetricsController(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }

    @GetMapping("/status-counts")
    public Map<String, Long> getStatusCounts() {

        Map<String, Long> metrics = new HashMap<>();

        metrics.put("IN_TRANSIT",
                shipmentRepository.countByStatus("IN_TRANSIT"));

        metrics.put("DELIVERED",
                shipmentRepository.countByStatus("DELIVERED"));

        metrics.put("DELAYED",
                shipmentRepository.countByStatus("DELAYED"));

        return metrics;
    }

    @GetMapping("/delivered")
    public List<Shipment> deliveredShipments() {
        return shipmentRepository.findByStatus("DELIVERED");
    }
}