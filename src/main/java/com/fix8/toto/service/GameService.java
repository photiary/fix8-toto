package com.fix8.toto.service;

import com.fix8.toto.entity.Game;
import com.fix8.toto.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GameService {



    private final GameRepository gameRepository;

    @Autowired
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<Game> findAll() {
        return gameRepository.findAll();
    }

    public List<Game> saveAll(List<Game> gameList) {
        return gameRepository.saveAll(gameList);
    }
}
