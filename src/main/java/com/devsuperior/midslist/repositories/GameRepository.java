package com.devsuperior.midslist.repositories;

import com.devsuperior.midslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
