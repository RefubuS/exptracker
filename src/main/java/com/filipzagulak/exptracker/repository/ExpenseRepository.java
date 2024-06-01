package com.filipzagulak.exptracker.repository;

import com.filipzagulak.exptracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, String> {
}
