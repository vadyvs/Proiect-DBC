package org.example.controller;

import lombok.RequiredArgsConstructor;

import org.example.entity.Laminates;

import org.example.service.LaminatesService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/laminates")

public class LaminatesController {


    private final LaminatesService laminatesService;


    @PostMapping("/name")
    public void createLaminates(@RequestBody Laminates laminates) {
        laminatesService.save(laminates);
    }

    @PutMapping("/name")
    public void updatePut(@PathVariable("name") String existingName, @RequestBody Laminates laminates){
        laminatesService.updatePut(existingName, laminates);

    }

    @PatchMapping("/name")
    void updatePatch(@PathVariable("name") String existingName, @RequestBody Laminates laminates){
        laminatesService.updatePatch(existingName, laminates);

    }

    @GetMapping("/all")
    public List<Laminates> getLaminates() {
        return laminatesService.findAll();
    }

    @GetMapping("/name")
    public List<Laminates> getByName(@RequestParam String laminatesName){

        return laminatesService.findByName(laminatesName);
    }

    @DeleteMapping("/name")
    public void deleteByName(@PathVariable String name){
        laminatesService.deleteByName(name);

    }

    @DeleteMapping("/all")
    public void deleteAll() {
        laminatesService.deleteAll();
    }




}
