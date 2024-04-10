package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.entity.Accessory;
import org.example.repository.AccessoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccessoryService {

    private final AccessoryRepository accessoryRepository;

    public void save(Accessory accessory) {
        accessoryRepository.save(accessory);
    }

    public void updatePut(String existingName, Accessory accessory) {
        accessoryRepository.save(accessory);
    }

    public void updatePatch(String existingName, Accessory accessory) {
        accessoryRepository.save(accessory);
    }

    public List<Accessory> findAll() {
        return accessoryRepository.findAll();
    }

    public List<Accessory> findByName(String accessoryName) {
        return accessoryRepository.findByName(accessoryName);
    }

    public void deleteByName(String name) {
        accessoryRepository.deleteByName(name);
    }

    public void deleteAll() {
        accessoryRepository.deleteAll();
    }
}
