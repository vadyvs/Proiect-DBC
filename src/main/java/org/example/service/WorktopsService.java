package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.entity.Worktops;
import org.example.repository.WorktopsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WorktopsService {

    private final WorktopsRepository worktopsRepository;


    public void save(Worktops worktops) {
        worktopsRepository.save(worktops);
    }

    public void updatePut(String existingName, Worktops worktops) {
        worktopsRepository.save(worktops);
    }

    public void updatePatch(String existingName, Worktops worktops) {
        worktopsRepository.save(worktops);
    }

    public List<Worktops> findAll() {
        return worktopsRepository.findAll();
    }

    public List<Worktops> findByName(String worktopsName) {
        return worktopsRepository.findByName(worktopsName);
    }

    public void deleteByName(String name) {
        worktopsRepository.deleteByName(name);
    }

    public void deleteAll() {
        worktopsRepository.deleteAll();
    }
}
