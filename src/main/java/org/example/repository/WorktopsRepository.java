package org.example.repository;


import org.example.entity.Worktops;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface WorktopsRepository extends JpaRepository <Worktops, UUID> {

    List<Worktops> findByName (String name);

    void deleteByName(String name);
}
