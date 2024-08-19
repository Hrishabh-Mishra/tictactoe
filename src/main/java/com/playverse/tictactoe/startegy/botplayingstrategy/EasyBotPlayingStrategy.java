package com.playverse.tictactoe.startegy.botplayingstrategy;

import java.util.List;

import com.playverse.tictactoe.model.Board;
import com.playverse.tictactoe.model.Cell;
import com.playverse.tictactoe.model.CellStatus;
import com.playverse.tictactoe.utils.Pair;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Pair<Integer, Integer> makeMove(final Board board) {
        //Easy bot - makes move on the first empty cell
        for (List<Cell> row : board.getCells()) {
            for (Cell cell : row) {
                if(cell.getStatus().equals(CellStatus.UNOCCUPIED)){
                    return  new Pair<>(cell.getX(), cell.getY());
                }
            }
        }
        //todo Add exception here instead of returning null
        return null;
    }
}
