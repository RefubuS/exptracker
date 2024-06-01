package com.filipzagulak.exptracker.repository;

import com.filipzagulak.exptracker.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {
}
