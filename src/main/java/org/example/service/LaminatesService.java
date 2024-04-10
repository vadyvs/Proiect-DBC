package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.entity.Laminates;
import org.example.repository.LaminatesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class LaminatesService {

    private final LaminatesRepository laminatesRepository;


    public void save(Laminates laminates) {
        laminatesRepository.save(laminates);
    }

    public void updatePut(String existingName, Laminates laminates) {
        laminatesRepository.save(laminates);
    }

    public void updatePatch(String existingName, Laminates laminates) {
        laminatesRepository.save(laminates);
    }

    public List<Laminates> findAll() {
        return laminatesRepository.findAll();
    }

    public List<Laminates> findByName(String laminatesName) {
        return laminatesRepository.findByName(laminatesName);
    }

    public void deleteByName(String name) {
        laminatesRepository.deleteByName(name);
    }

    public void deleteAll() {
        laminatesRepository.deleteAll();
    }
}
