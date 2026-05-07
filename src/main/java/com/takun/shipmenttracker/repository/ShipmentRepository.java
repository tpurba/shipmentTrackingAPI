package com.takun.shipmenttracker.repository;

import com.takun.shipmenttracker.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentRepository extends JpaRepository<Shipment, Long> {

}