package com.example.micky.expense.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name="category")
@NoArgsConstructor
@Data
public class Category {
    @Id
    private Long id;

    @NonNull
    //Travel,Grocery
    private String name;
    
}