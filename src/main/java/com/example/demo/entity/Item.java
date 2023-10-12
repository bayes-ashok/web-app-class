package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="items") // Define the table name as "items"
public class Item {
    @Id
    @SequenceGenerator(name = "items_seq_gen", sequenceName = "items_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "items_seq_gen", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name="item_name", nullable = false, length = 50)
    private String itemName;

    @Column(name="description", nullable = true)
    private String description;

    @Column(name="price", nullable = false)
    private Double price;


}
