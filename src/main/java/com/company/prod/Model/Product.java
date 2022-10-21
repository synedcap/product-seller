package com.company.prod.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 150)
    private String description;

    @Column(nullable = false)
    private Integer price;


    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category categories;



}
