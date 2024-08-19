package com.playverse.tictactoe.model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> cells;
    private GameStatus gameStatus;
    private Player winner;
    public Board(final int boardSize) {
        gameStatus = GameStatus.IN_PROGRESS;
        cells = new ArrayList<>(boardSize);
        for(int i=0; i<boardSize; i++){
            cells.add(new ArrayList<>(boardSize));
            for(int j=0; j<boardSize; j++){
                cells.get(i).add(new Cell(i, j));
            }
        }
    }
    public List<List<Cell>> getCells() {
        return cells;
    }
    /*public Board getBoard() {
        *//*for (List<Cell> cell : cells) {
            for (Cell currCell : cell) {
                if (currCell.getStatus() == CellStatus.UNOCCUPIED) {
                    System.out.print(" - ");
                } else if (currCell.getStatus() == CellStatus.OCCUPIED) {
                    System.out.print(" " + currCell.getPlayer().getSymbol().getS() + " ");
                }
            }
            System.out.println();
        }*//*
        return this;
    }*/
    public int getBoardSize(){
        return this.cells.size();
    }
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }
    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }
}
