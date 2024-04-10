package org.example;


import org.example.entity.Accessory;
import org.example.entity.Furniture;
import org.example.entity.Laminates;
import org.example.entity.Worktops;
import org.example.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }

    @Bean
    public CommandLineRunner runMe(FurnitureRepository furnitureRepository, AccessoryRepository accessoryRepository, LaminatesRepository laminatesRepository, WorktopsRepository worktopsRepository) {
        return (args) -> {

            Furniture furniture = new Furniture();
            furniture.setName("H3081 ST22");
            furniture.setQuantity(Integer.valueOf("16"));
            furniture.setDimension(Integer.valueOf("2800"));
//            furnitureRepository.save(furniture);

            System.out.println(furniture);
//            System.out.println(furnitureRepository.findAll());
//            System.out.println(furnitureRepository.findByName("w1100 st9"));


            Accessory accessory = new Accessory();
            accessory.setName("Amortizor");
            accessory.setQuantity(Integer.valueOf("50"));
//            accessoryRepository.save(accessory);

            System.out.println(accessory);
//            System.out.println(accessoryRepository.findAll());
//            System.out.println(accessoryRepository.findByName("Balama"));

            Laminates laminates = new Laminates();
            laminates.setName("PFL Alb");
            laminates.setQuantity(Integer.valueOf("30"));
            laminates.setDimension(Integer.valueOf("2800"));
//            laminatesRepository.save(laminates);

            System.out.println(laminates);
//            System.out.println(laminatesRepository.findAll());
//            System.out.println(laminatesRepository.findByName("PFL Alb"));


            Worktops worktops = new Worktops();
            worktops.setName("F547 ST9");
            worktops.setQuantity(Integer.valueOf("2"));
            worktops.setDimension(Integer.valueOf("4100"));
//            worktopsRepository.save(worktops);

            System.out.println(worktops);
//            System.out.println(worktopsRepository.findAll());
//            System.out.println(worktopsRepository.findByName("w1100 st9"));

        };
       }













}