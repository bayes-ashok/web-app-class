package com.example.demo.Pojo;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserPojo {
    private Integer id;

    @NotEmpty(message = "Full Name required")
    @NotNull(message = "Full Name required")

    private String full_name;
    @NotEmpty(message = "User Name required")
    @NotNull(message = "User Name required")

    private String username;
    private String password;
}
