package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.entity.Furniture;
import org.example.repository.FurnitureRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FurnitureService {

    private final FurnitureRepository furnitureRepository;


    public List<Furniture> findAll() {
        return furnitureRepository.findAll();
    }

    public List<Furniture> findByName(String furnitureName) {
        return furnitureRepository.findByName(furnitureName);
    }

    public void deleteByName(String name) {
        furnitureRepository.deleteByName(name);
    }

    public void deleteAll() {
        furnitureRepository.deleteAll();
    }

    public void save(Furniture furniture) {
        furnitureRepository.save(furniture);
    }

    public void updatePut(String existingName, Furniture furniture) {
        furnitureRepository.save(furniture);

    }

    public void updatePatch(String existingName, Furniture furniture) {
        furnitureRepository.save(furniture);
    }
}
