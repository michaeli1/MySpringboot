package com.example.micky.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.micky.expense.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);
}