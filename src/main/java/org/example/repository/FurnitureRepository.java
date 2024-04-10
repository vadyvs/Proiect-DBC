package org.example.repository;

import org.example.entity.Furniture;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface FurnitureRepository extends JpaRepository <Furniture, UUID> {


   List<Furniture> findByName(String furnitureName);

   void deleteByName(String name);
}
