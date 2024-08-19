package com.playverse.tictactoe.startegy.botplayingstrategy;

import com.playverse.tictactoe.model.Board;
import com.playverse.tictactoe.utils.Pair;

public interface BotPlayingStrategy {
    public Pair<Integer, Integer> makeMove(Board board);
}
