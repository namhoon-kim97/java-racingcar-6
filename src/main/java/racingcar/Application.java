package racingcar;

import java.util.List;
import racingcar.domain.GameController;
import racingcar.domain.InputCarName;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        GameController gameController = new GameController();
        gameController.playGame();
    }
}
