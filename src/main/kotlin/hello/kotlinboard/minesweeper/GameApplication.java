package hello.kotlinboard.minesweeper;

import hello.kotlinboard.minesweeper.config.GameConfig;
import hello.kotlinboard.minesweeper.gamelevel.Beginner;
import hello.kotlinboard.minesweeper.io.ConsoleInputHandler;
import hello.kotlinboard.minesweeper.io.ConsoleOutputHandler;

public class GameApplication {

    public static void main(String[] args) {
        GameConfig gameConfig = new GameConfig(
                new Beginner(),
                new ConsoleInputHandler(),
                new ConsoleOutputHandler()
        );

        Minesweeper minesweeper = new Minesweeper(gameConfig);
        minesweeper.initialize();
        minesweeper.run();
    }

}
