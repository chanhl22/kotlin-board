package hello.kotlinboard.minesweeper.io.sign;

import hello.kotlinboard.minesweeper.board.cell.CellSnapshot;

public interface CellSignProvidable {

    boolean supports(CellSnapshot cellSnapshot);

    String provide(CellSnapshot cellSnapshot);

}
