package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor

public class Furniture {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)

    private UUID id;

    private String name;

    private Integer quantity;

    private Integer dimension;



}
