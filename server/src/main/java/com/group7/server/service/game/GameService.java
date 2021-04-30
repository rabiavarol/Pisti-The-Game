package com.group7.server.service.game;

import com.group7.server.definitions.game.Game;
import com.group7.server.definitions.game.GameEnvironment;
import com.group7.server.definitions.common.StatusCode;

import java.util.List;

/**
 * Responsible for providing utilities to the GameController.
 *
 */
public interface GameService {
    StatusCode initGame(Long sessionId, Object[] gameId);
    StatusCode interactGame(Long sessionId, Long gameId, Short cardNo, Game.MoveType moveType, List<GameEnvironment> gameEnvironmentList);
    StatusCode removeGame(Long sessionId, Long gameId);
}
