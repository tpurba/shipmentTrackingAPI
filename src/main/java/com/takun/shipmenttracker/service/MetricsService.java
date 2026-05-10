package com.takun.shipmenttracker.service;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Service;

@Service
public class MetricsService {

    private final Counter shipmentCreatedCounter;

    public MetricsService(MeterRegistry registry) {

        shipmentCreatedCounter = Counter.builder("shipments_created_total")
                .description("Total shipments created")
                .register(registry);
    }

    public void incrementShipmentCounter() {
        shipmentCreatedCounter.increment();
    }
}