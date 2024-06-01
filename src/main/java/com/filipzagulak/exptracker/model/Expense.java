package com.filipzagulak.exptracker.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "expenses")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
}
