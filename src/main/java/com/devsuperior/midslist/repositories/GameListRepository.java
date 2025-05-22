package com.devsuperior.midslist.repositories;

import com.devsuperior.midslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
