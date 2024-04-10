package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.entity.Furniture;

import org.example.service.FurnitureService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/furniture")


public class FurnitureController {

    private final FurnitureService furnitureService;

    @PostMapping("/name")
    public void createFurniture(@RequestBody Furniture furniture) {
        furnitureService.save(furniture);
    }

    @PutMapping("/name")
    public void updatePut(@PathVariable("name") String existingName, @RequestBody Furniture furniture){
        furnitureService.updatePut(existingName, furniture);

    }

    @PatchMapping("/name")
    void updatePatch(@PathVariable("name") String existingName, @RequestBody Furniture furniture){
        furnitureService.updatePatch(existingName, furniture);

    }

    @GetMapping("/all")
    public List<Furniture> getFurnitures() {
        return furnitureService.findAll();
    }

    @GetMapping("/name")
    public List<Furniture> getByName(@RequestParam String furnitureName){

        return furnitureService.findByName(furnitureName);
    }

    @DeleteMapping("/name")
    public void deleteByName(@PathVariable String name){
        furnitureService.deleteByName(name);

    }

    @DeleteMapping("/all")
    public void deleteAll() {
        furnitureService.deleteAll();
    }












}
