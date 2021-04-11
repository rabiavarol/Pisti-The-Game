package com.group7.server.repository;

import com.group7.server.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository
        extends JpaRepository<Player, Long> {}