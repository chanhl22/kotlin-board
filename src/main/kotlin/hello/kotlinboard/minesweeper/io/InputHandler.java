package hello.kotlinboard.minesweeper.io;

import hello.kotlinboard.minesweeper.board.position.CellPosition;
import hello.kotlinboard.minesweeper.user.UserAction;

public interface InputHandler {

    UserAction getUserActionFromUser();

    CellPosition getCellPositionFromUser();

}
