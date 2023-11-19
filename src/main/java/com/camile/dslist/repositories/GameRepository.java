package com.camile.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camile.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}