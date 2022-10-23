package com.example.endofthegame.entity;

import com.example.endofthegame.entity.enumeration.IncomeCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Income {
        // TODO: improve generation of ID
        @Id
        Long id;
        IncomeCategory category;
        String currency;
        BigDecimal amount;
        String person; // TODO: Refactor later
        ZonedDateTime timestamp;
        // String source,
        // String type
}
