package com.example.endofthegame.entity;

import com.example.endofthegame.entity.enumeration.IncomeCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Entity
@Table(name = "INCOMES")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Income {
        // TODO: improve generation of ID
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;
        @Enumerated(EnumType.STRING)
        IncomeCategory category;
        String currency;
        BigDecimal amount;
        String person; // TODO: Refactor later
        ZonedDateTime timestamp;
        // String source,
        // String type
}
