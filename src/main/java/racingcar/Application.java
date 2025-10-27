package racingcar;

import racingcar.controller.RacingController;
import racingcar.parser.CarNamesParser;
import racingcar.view.InputView;

public class Application {
    public static void main(String[] args) {

        InputView inputView = new InputView();
        CarNamesParser carNamesParser = new CarNamesParser();
        RacingController raceController = new RacingController(inputView, carNamesParser);
        raceController.run();

    }
}
