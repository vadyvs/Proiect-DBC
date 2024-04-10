package org.example.repository;

import org.example.entity.Furniture;
import org.example.entity.Laminates;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface LaminatesRepository extends JpaRepository <Laminates, UUID> {

    List<Laminates> findByName (String name);

    void deleteByName(String name);
}
