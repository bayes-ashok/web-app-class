package com.example.demo.Pojo;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemPojo {
    private Integer id;

    @NotEmpty(message = "Item Name required")
    @NotNull(message = "Item Name required")
    private String itemName;

    private String description;

    @NotNull(message = "Price required")
    private Double price;
}
