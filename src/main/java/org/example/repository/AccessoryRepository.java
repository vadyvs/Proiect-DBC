package org.example.repository;

import org.example.entity.Accessory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface AccessoryRepository extends JpaRepository <Accessory, UUID> {

    List<Accessory> findByName(String name);

    void deleteByName(String name);
}
