package com.fix8.toto.controller;

import com.fix8.toto.dto.GameDto;
import com.fix8.toto.service.GameService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class GameController {

    private final ModelMapper modelMapper;
    private final GameService gameService;

    @Autowired
    public GameController(ModelMapper modelMapper, GameService gameService) {
        this.modelMapper = modelMapper;
        this.gameService = gameService;
    }

    @GetMapping(path = "/games")
    public List<GameDto> findAllGames() {
       return gameService.findAll()
               .stream().map(game -> modelMapper.map(game, GameDto.class))
               .collect(Collectors.toList());
    }
}
