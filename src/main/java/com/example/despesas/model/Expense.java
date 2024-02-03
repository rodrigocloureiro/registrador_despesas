package com.example.despesas.model;

import com.example.despesas.model.enums.Category;
import com.example.despesas.model.enums.Situation;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@ToString
@Getter
@Setter
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    public LocalDateTime date;
    private String name;
    private String description;
    private Category category;
    private double amount;
    private Situation situation;

    public Expense() {
    }
}
