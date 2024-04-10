package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.entity.Worktops;
import org.example.service.WorktopsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/worktops")

public class WorktopsController {


    private final WorktopsService worktopsService;

    @PostMapping("/name")
    public void createWorktops(@RequestBody Worktops worktops) {
        worktopsService.save(worktops);
    }

    @PutMapping("/name")
    public void updatePut(@PathVariable("name") String existingName, @RequestBody Worktops worktops){
        worktopsService.updatePut(existingName, worktops);

    }

    @PatchMapping("/name")
    void updatePatch(@PathVariable("name") String existingName, @RequestBody Worktops worktops){
        worktopsService.updatePatch(existingName, worktops);

    }

    @GetMapping("/all")
    public List<Worktops> getWorktops() {
        return worktopsService.findAll();
    }

    @GetMapping("/name")
    public List<Worktops> getByName(@RequestParam String worktopsName){

        return worktopsService.findByName(worktopsName);
    }

    @DeleteMapping("/name")
    public void deleteByName(@PathVariable String name){
        worktopsService.deleteByName(name);

    }

    @DeleteMapping("/all")
    public void deleteAll() {
        worktopsService.deleteAll();
    }


}
