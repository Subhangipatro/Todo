package com.example.todoapplication.model;


import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@ToString

public class Todoitem {
    @NotBlank
    private Long id;
    private String title;
    private Boolean done;
}
