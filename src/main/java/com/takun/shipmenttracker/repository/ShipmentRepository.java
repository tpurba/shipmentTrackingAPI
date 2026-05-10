package com.takun.shipmenttracker.repository;

import com.takun.shipmenttracker.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShipmentRepository extends JpaRepository<Shipment, Long> {

    List<Shipment> findByStatus(String status);

    long countByStatus(String status);
}