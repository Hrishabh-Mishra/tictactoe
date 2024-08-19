package com.playverse.tictactoe.factories;

import com.playverse.tictactoe.model.BotDifficultyLevel;
import com.playverse.tictactoe.startegy.botplayingstrategy.BotPlayingStrategy;
import com.playverse.tictactoe.startegy.botplayingstrategy.EasyBotPlayingStrategy;

public class BotPlayerFactory {

    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel) {
        switch (botDifficultyLevel){
            case EASY:
            case MEDIUM:
            case DIFFICULT:
                return new EasyBotPlayingStrategy();
            default:
                throw new UnsupportedOperationException("There is no implementation for the selected bot difficulty level");
        }
    }
}
