package com.example.todoapplication.repository;

import com.example.todoapplication.model.Todoitem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<Todoitem,Long> {
}
