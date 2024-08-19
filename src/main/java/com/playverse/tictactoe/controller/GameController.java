package com.playverse.tictactoe.controller;

import java.util.ArrayList;
import java.util.List;

import com.playverse.tictactoe.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GameController {
    Game game;
    List<Player> players = new ArrayList<>();//To mock the list of players. Will ideally come form the frontend

    @GetMapping("/hello")
    public String hello(){
        return "Hello from Hrishabh.";
    }

    @PostMapping("/createGame")
    public boolean createGame(@RequestBody List<Player> players){
        this.game = Game.getBuilder()
                        .setPlayers(players)
                        .build();
        //todo: return based on successful game creation.
        return true;
    }

    @GetMapping("/board")
    public Board getBoard(){
        mockGameCreation();
        return game.board;
    }

    @PostMapping("/makeMove")
    public ResponseEntity<Board> makeMove(@RequestBody Cell cell){
        //mockGameCreation();
        game.makeMove(cell);
        return new ResponseEntity<Board>(game.board, HttpStatus.OK);
    }
    @GetMapping("/gameStatus")
    public GameStatus getGameStatus(){
        return game.getGameStatus();
    }
        @GetMapping("/currentPlayerStatus")
    public Player getCurrentPlayer() {
        return game.getCurrentPlayer();
    }
    @PostMapping("/undoMove")
    public void undoMove() {
        game.undoMove();
    }
    @GetMapping("/replayGame")
    public void replayGame(){
        game.replayGame();
    }

    private void mockGameCreation() {
        //mocking the game creation for testing
        //mock start
        this.players.add(new HumanPlayer("Hrishabh", new Symbol('H'), 0));
        this.players.add(new HumanPlayer("Karan", new Symbol('K'), 0));
        this.createGame(players);
        //mock end
    }
}
