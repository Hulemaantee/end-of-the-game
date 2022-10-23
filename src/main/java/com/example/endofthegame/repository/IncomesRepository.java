package com.example.endofthegame.repository;

import com.example.endofthegame.entity.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface IncomesRepository extends JpaRepository<Income, Long> {
}
