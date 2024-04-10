package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.entity.Accessory;
import org.example.service.AccessoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/accessory")

public class AccessoryController {


    private final AccessoryService accessoryService;

    @PostMapping("/name")
    public void createAccessory(@RequestBody Accessory accessory) {
        accessoryService.save(accessory);
    }

    @PutMapping("/name")
    public void updatePut(@PathVariable("name") String existingName, @RequestBody Accessory accessory){
        accessoryService.updatePut(existingName, accessory);

    }

    @PatchMapping("/name")
    void updatePatch(@PathVariable("name") String existingName, @RequestBody Accessory accessory){
        accessoryService.updatePatch(existingName, accessory);

    }

    @GetMapping("/all")
    public List<Accessory> getAccessory() {
        return accessoryService.findAll();
    }

    @GetMapping("/name")
    public List<Accessory> getByName(@RequestParam String accessoryName){

        return accessoryService.findByName(accessoryName);
    }

    @DeleteMapping("/name")
    public void deleteByName(@PathVariable String name){
        accessoryService.deleteByName(name);

    }

    @DeleteMapping("/all")
    public void deleteAll() {
        accessoryService.deleteAll();
    }





}
