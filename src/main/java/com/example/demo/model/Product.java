package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.persistence.*;

@Entity
@Table( name = "product")
@Data
@NoArgsConstructor
@AllArgsConstructor

class Product {
    @Id
    @Column(name = "id")
    private Long id;
    @Column
    private String name;
    @Column
    private String photo;
    @Column
    private double price;
}
