package racingcar;

import racingcar.controller.RaceController;
import racingcar.view.InputView;

public class Application {
    public static void main(String[] args) {

        InputView inputView = new InputView();
        RaceController raceController = new RaceController(inputView);
        raceController.run();

    }
}
