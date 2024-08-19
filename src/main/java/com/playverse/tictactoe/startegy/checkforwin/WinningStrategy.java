package com.playverse.tictactoe.startegy.checkforwin;

import com.playverse.tictactoe.model.Board;
import com.playverse.tictactoe.model.Cell;

public interface WinningStrategy {
    public boolean checkForWin(Board board, Cell currentCell);
    public  void updateOnUndo(Board board, Cell currentCell);
}
